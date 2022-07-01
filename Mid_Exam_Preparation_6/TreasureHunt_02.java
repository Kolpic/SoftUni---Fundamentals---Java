package Mid_Exam_Preparation_6;

import java.util.Scanner;

public class TreasureHunt_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] treasureChest = scanner.nextLine().split("\\|");


        String command = scanner.nextLine();

        while (!command.equals("Yohoho!")){
            String[] commandArr = command.split(" ");

            String activity = commandArr[0];

            switch (activity){
                case "Loot":
                    for (int i = 1; i <= commandArr.length - 1; i++) {
                        boolean alreadyContainInTheChest = false;
                        for (int j = 0; j < treasureChest.length; j++) {
                            if (commandArr[i].equals(treasureChest[j])){
                                alreadyContainInTheChest = true;
                                break;
                            }
                        }
                        if (!alreadyContainInTheChest){
                            String newChest = commandArr[i] + " " + String.join(" ",treasureChest);
                            treasureChest = newChest.split(" ");
                        }
                    }
                    break;

                case "Drop":
                    int index = Integer.parseInt(commandArr[1]);
                    if (index >= 0 && index < treasureChest.length){
                        String itemToBeRemoved = treasureChest[index];
                        for (int i = index; i < treasureChest.length - 1; i++) {
                            treasureChest[i] = treasureChest[i + 1];
                        }
                        treasureChest[treasureChest.length - 1] = itemToBeRemoved;
                    }else{
                        break;
                    }
                    break;

                case "Steal":
                    int countStolenItems = Integer.parseInt(commandArr[1]);

                    if (countStolenItems >= 1){
                        for (int i = treasureChest.length - 1; i <= countStolenItems; i--) {

                        }
                    }
                    break;

            }

            command = scanner.nextLine();
        }
    }
}
