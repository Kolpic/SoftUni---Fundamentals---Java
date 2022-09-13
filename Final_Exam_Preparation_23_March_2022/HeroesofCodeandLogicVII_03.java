package Final_Exam_Preparation_23_March_2022;

import java.util.*;

public class HeroesofCodeandLogicVII_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Integer>> heroesMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String hero = scanner.nextLine();
            String heroName = hero.split("\\s+")[0];
            int heroHp =Integer.parseInt(hero.split("\\s+")[1]);
            int heroMP =Integer.parseInt( hero.split("\\s+")[2]);
            List<Integer> heroHpHeroMP = new ArrayList<>();
            heroHpHeroMP.add(heroHp);
            heroHpHeroMP.add(heroMP);
            heroesMap.put(heroName,heroHpHeroMP);
        }
        String command = scanner.nextLine();

        while (!command.equals("End")){
            switch (command.split(" - ")[0]){
                case "CastSpell":
                    String heroName = command.split(" - ")[1];
                    int manaNeeded = Integer.parseInt(command.split(" - ")[2]);
                    String spellName = command.split(" - ")[3];
                    if (heroesMap.containsKey(heroName)){
                        int currentMana =  heroesMap.get(heroName).get(1);
                        int heroHp = heroesMap.get(heroName).get(0);
                        if (currentMana >= manaNeeded){
                            currentMana -= manaNeeded;
                            System.out.printf("%s has successfully cast %s and now has %d MP!%n"
                                    ,heroName,spellName,currentMana);
                           heroesMap.put(heroName,new ArrayList());
                           heroesMap.get(heroName).add(heroHp);
                           heroesMap.get(heroName).add(currentMana);
                        }else {
                            System.out.printf("%s does not have enough MP to cast %s!%n",heroName,spellName);
                        }
                    }
                    break;

                case "TakeDamage":
                    String heroNameTakeDamage = command.split(" - ")[1];
                    int damage = Integer.parseInt(command.split(" - ")[2]);
                    String attacker = command.split(" - ")[3];

                    if (heroesMap.containsKey(heroNameTakeDamage)){
                      int currentHp = heroesMap.get(heroNameTakeDamage).get(0);
                      int currentMP = heroesMap.get(heroNameTakeDamage).get(1);
                      int result = currentHp - damage;
                      if (result >= 0){
                          System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n"
                          ,heroNameTakeDamage,damage,attacker,result);
                          heroesMap.put(heroNameTakeDamage,new ArrayList<>());
                          heroesMap.get(heroNameTakeDamage).add(result);
                          heroesMap.get(heroNameTakeDamage).add(currentMP);
                      }else{
                          System.out.printf("%s has been killed by %s!%n",heroNameTakeDamage,attacker);
                          heroesMap.remove(heroNameTakeDamage);
                      }
                    }
                    break;

                case "Recharge":
                    String heroNameRecharge = command.split(" - ")[1];
                    int amountMP = Integer.parseInt(command.split(" - ")[2]);
                    if (heroesMap.containsKey(heroNameRecharge)){
                        int currentMP = heroesMap.get(heroNameRecharge).get(1);
                        int currentHP = heroesMap.get(heroNameRecharge).get(0);
                        int result = currentMP + amountMP;
                        if (result > 200){
                            result = 200;
                            int checkMP = 200 - currentMP;
                            amountMP = checkMP;
                        }
                        heroesMap.put(heroNameRecharge,new ArrayList<>());
                        heroesMap.get(heroNameRecharge).add(currentHP);
                        heroesMap.get(heroNameRecharge).add(result);
                        System.out.printf("%s recharged for %d MP!%n",heroNameRecharge,amountMP);
                    }
                    break;

                case "Heal":
                    String heroNameHeal = command.split(" - ")[1];
                    int amountHP = Integer.parseInt(command.split(" - ")[2]);

                    if (heroesMap.containsKey(heroNameHeal)){
                        int currentHP = heroesMap.get(heroNameHeal).get(0);
                        int currentMP = heroesMap.get(heroNameHeal).get(1);
                        int result = currentHP + amountHP;
                        if (result > 100){
                            result = 100;
                           int checkHP = 100 - currentHP;
                            amountHP = checkHP;
                        }
                        heroesMap.put(heroNameHeal,new ArrayList<>());
                        heroesMap.get(heroNameHeal).add(result);
                        heroesMap.get(heroNameHeal).add(currentMP);
                        System.out.printf("%s healed for %d HP!%n",heroNameHeal,amountHP);
                    }
                    break;
            }

            command = scanner.nextLine();
        }
        heroesMap.entrySet().forEach(e -> System.out.printf("%s%n  HP: %d%n  MP: %d%n"
                ,e.getKey(),e.getValue().get(0),e.getValue().get(1)));
    }
}
