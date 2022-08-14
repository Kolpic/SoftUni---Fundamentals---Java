package Final_Exam_04_Programming_Fundamentals_Final_Exam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HeroesofCodeandLogicVII_03 {
    static class Hero{
        String heroName;
        int HP;
        int MP;

        public Hero(String heroName, int HP, int MP) {
            this.heroName = heroName;
            this.HP = HP;
            this.MP = MP;
        }

        public String getHeroName() {
            return heroName;
        }

        public void setHeroName(String heroName) {
            this.heroName = heroName;
        }

        public int getHP() {
            return HP;
        }

        public void setHP(int HP) {
            this.HP = HP;
        }

        public int getMP() {
            return MP;
        }

        public void setMP(int MP) {
            this.MP = MP;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String,Hero> mapHeroes = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String heroStats = scanner.nextLine();
            String heroName = heroStats.split("\\s+")[0];
            int HP = Integer.parseInt(heroStats.split("\\s+")[1]);
            int MP = Integer.parseInt(heroStats.split("\\s+")[2]);
            Hero hero = new Hero(heroName,HP,MP);
            mapHeroes.put(heroName,hero);
        }
        String command = scanner.nextLine();

        while (!command.equals("End")){
            String name = command.split(" - ")[1];
            switch (command.split(" - ")[0]){
                case"CastSpell":
                    int MPNeeded = Integer.parseInt(command.split(" - ")[2]);
                    String spellName = command.split(" - ")[3];

                    int currentMP = mapHeroes.get(name).getMP();
                    if (currentMP >= MPNeeded){
                        mapHeroes.get(name).setMP(currentMP - MPNeeded);
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n"
                        ,name,spellName,mapHeroes.get(name).getMP());
                    }else {
                        System.out.printf("%s does not have enough MP to cast %s!%n",name,spellName);
                    }
                    break;

                case"TakeDamage":
                    int damage = Integer.parseInt(command.split(" - ")[2]);
                    String attacker = command.split(" - ")[3];

                    int currentHP = mapHeroes.get(name).getHP();
                    mapHeroes.get(name).setHP(currentHP - damage);
                    if (mapHeroes.get(name).getHP() > 0){
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n"
                        ,name,damage,attacker,mapHeroes.get(name).getHP());
                    }else {
                        System.out.printf("%s has been killed by %s!%n",name,attacker);
                        mapHeroes.remove(name);
                    }
                    break;

                case"Recharge":
                    int amount = Integer.parseInt(command.split(" - ")[2]);
                    int currentMPForRecharge =  mapHeroes.get(name).getMP();
                    int result = amount + currentMPForRecharge;
                    int check = result;
                    if (result > 200){
                        result = 200;
                        check = 200 - currentMPForRecharge;
                        mapHeroes.get(name).setMP(result);
                        System.out.printf("%s recharged for %d MP!%n",name,check);
                    }else {
                        mapHeroes.get(name).setMP(result);
                        System.out.printf("%s recharged for %d MP!%n",name,amount);
                    }
                    break;

                case"Heal":
                    int amountToHeal = Integer.parseInt(command.split(" - ")[2]);
                    int currentHPForRecharge =  mapHeroes.get(name).getHP();
                    int results = amountToHeal + currentHPForRecharge;
                    int checks = results;
                    if (results > 100){
                        result = 100;
                        checks = 100 - currentHPForRecharge;
                        mapHeroes.get(name).setHP(result);
                        System.out.printf("%s healed for %d HP!%n",name,checks);
                    }else {
                        mapHeroes.get(name).setHP(results);
                        System.out.printf("%s healed for %d HP!%n",name,amountToHeal);
                    }
                    break;
            }

            command = scanner.nextLine();
        }
        mapHeroes.entrySet().forEach(e-> System.out.printf("%s%n  HP: %d%n  MP: %d%n"
                ,e.getKey(),e.getValue().getHP(),e.getValue().getMP()));
    }
}
