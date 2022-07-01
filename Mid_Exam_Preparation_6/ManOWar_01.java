package Mid_Exam_Preparation_6;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ManOWar_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> statusPirateShip = Arrays.stream
                (scanner.nextLine().split("\\>")).collect(Collectors.toList());

        List<String> warship = Arrays.stream
                (scanner.nextLine().split("\\>")).collect(Collectors.toList());

        int maximumHealthCapacity = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        boolean flag = false;

        while(!command.equals("Retire")){
//            if (flag){
//                break;
//            }
            String[] commandArr = command.split(" ");

            switch (commandArr[0]){
                case "Fire":
                    if (flag){
                        break;
                    }
                    int index = Integer.parseInt(commandArr[1]);
                    int damage = Integer.parseInt(commandArr[2]);

                    if (isValidIndex(statusPirateShip,index)){
                        int valuePirateShip = Integer.parseInt(statusPirateShip.get(index));
                        int valueWarship = Integer.parseInt(warship.get(index));
                        int remainingWarshipHealth = valueWarship - damage;
                        if (remainingWarshipHealth <= 0){
                            System.out.println("You won! The enemy ship has sunken.");
                            break;
                        }else{
                            warship.set(index,"" + remainingWarshipHealth);
                        }

                    }
                    break;

                case "Defend":
                    if (flag){
                        break;
                    }
                    int startIndex = Integer.parseInt(commandArr[1]);
                    int endIndex = Integer.parseInt(commandArr[2]);
                    int damageToDefend = Integer.parseInt(commandArr[3]);

                    if (startIndex >= 0 && startIndex <= statusPirateShip.size() -1
                        && endIndex >= 0 && endIndex <= statusPirateShip.size() -1
                        && startIndex < endIndex){

                        for (int i = startIndex; i <= endIndex; i++) {
                            int healthPirateShip =Integer.parseInt(statusPirateShip.get(i));
                            int remainingHealthPirateShip = healthPirateShip - damageToDefend;

                            if (remainingHealthPirateShip <= 0){
                                System.out.println("You lost! The pirate ship has sunken.");
                                flag = true;
                                break;
                            }else{
                                statusPirateShip.set(i,"" + remainingHealthPirateShip);
                            }
                        }

                    }
                    break;

                case "Repair":
                    if (flag){
                        break;
                    }
                    int indexRepair = Integer.parseInt(commandArr[1]);
                    int healthRepair = Integer.parseInt(commandArr[2]);
                    if (isValidIndex(statusPirateShip, indexRepair)){
                        int sectionToRepair =Integer.parseInt(statusPirateShip.get(indexRepair));
                        if (sectionToRepair == maximumHealthCapacity){
                            break;
                        }else {
                            int repairedSection = sectionToRepair + healthRepair;

                            if (repairedSection > maximumHealthCapacity) {
                                repairedSection = maximumHealthCapacity;
                                statusPirateShip.set(indexRepair,"" + repairedSection);

                            }else{
                                statusPirateShip.set(indexRepair,"" + repairedSection);
                            }
                        }
                    }
                    break;

                case "Status":
                    if (flag){
                        break;
                    }
                    int counter = 0;

                    for (int i = 0; i <= statusPirateShip.size() - 1; i++) {
                        int currentSection = Integer.parseInt(statusPirateShip.get(i));
                        double lowerHealth = maximumHealthCapacity * 0.2;

                        if (currentSection < lowerHealth){
                            counter++;
                        }
                    }
                    System.out.printf("%d sections need repair.%n",counter);
                    break;
            }

            command = scanner.nextLine();
        }

        if (!flag) {
            int resultPirates = 0;
            for (String num : statusPirateShip) {
                int numInteger = Integer.parseInt(num);
                resultPirates += numInteger;
            }

            int resultWarship = 0;
            for (String nums : warship) {
                int numInteger = Integer.parseInt(nums);
                resultWarship += numInteger;
            }

            System.out.printf("Pirate ship status: %d%n", resultPirates);
            System.out.printf("Warship status: %d%n", resultWarship);
        }
    }
    private static boolean isValidIndex (List<String> statusPirateShip, int index){
        return index >= 0 && index <= statusPirateShip.size() - 1;
    }
}
