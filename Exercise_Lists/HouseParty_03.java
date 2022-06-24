package Exercise_Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int countCommands = Integer.parseInt(scanner.nextLine());
        List<String> listGuests = new ArrayList<>();

        for (int i = 0; i < countCommands; i++) {
            String[] command = scanner.nextLine().split(" ");

            if (command[2].equals("going!")) {
                String currentName = command[0];

                    boolean currentNameList =(listGuests.contains(currentName));
                    if (currentNameList) {
                        System.out.printf("%s is already in the list!%n", command[0]);
                    } else {
                        listGuests.add(command[0]);
                    }


            } else {
                String currentName = command[0];

                boolean currentNameList =(listGuests.contains(currentName));
                    if (currentNameList) {
                        listGuests.remove(command[0]);
                    } else {
                        System.out.printf("%s is not in the list!%n", command[0]);
                    }

            }
        }
        for(String guest : listGuests){
            System.out.println(guest);
        }
    }
}
