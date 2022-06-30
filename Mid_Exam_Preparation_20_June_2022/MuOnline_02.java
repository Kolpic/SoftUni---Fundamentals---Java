package Mid_Exam_Preparation_20_June_2022;

import java.util.Scanner;

public class MuOnline_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialHealth = 100;
        int initialBitcoins = 0;
        boolean dead = false;

        String[] rooms = scanner.nextLine().split("\\|");

        for (int i = 0; i < rooms.length ; i++) {
            String[] activity = rooms[i].split(" ");
            if (dead){
                break;
            }
            switch (activity[0]){
                case "potion":
                    boolean heal = false;
                    int health = Integer.parseInt(activity[1]);
                    int leftHeal =Math.abs(100 - initialHealth);
                    initialHealth += health;
                    if (initialHealth > 100){
                        initialHealth = 100;
                        heal = true;
                        System.out.printf("You healed for %d hp.%n", leftHeal);
                        System.out.printf("Current health: %d hp.%n", initialHealth);
                    }
                    if (!heal) {
                        System.out.printf("You healed for %d hp.%n", health);
                        System.out.printf("Current health: %d hp.%n", initialHealth);
                    }
                    break;

                case "chest":
                    int money = Integer.parseInt(activity[1]);
                    initialBitcoins += money;
                    System.out.printf("You found %d bitcoins.%n",money);
                    break;

                default:
                    String monster = activity[0];
                    int monsterAttack = Integer.parseInt(activity[1]);

                    initialHealth -= monsterAttack;
                    if ((initialHealth > 0)){
                        System.out.printf("You slayed %s.%n",monster);
                    }else{
                        System.out.printf("You died! Killed by %s.%n",monster);
                        System.out.printf("Best room: %d",i + 1);
                        dead = true;
                        break;
                    }
            }
        }

        if (!dead){
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n",initialBitcoins);
            System.out.printf("Health: %d",initialHealth);
        }

    }
}
