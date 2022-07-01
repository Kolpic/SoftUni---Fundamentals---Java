package Mid_Exam_Preparation_6;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> journal  =
                Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while(!command.equals("Craft!")){
            String[] commandArr = command.split("\\ - ");
            String commandActivity = commandArr[0];
            String item = commandArr[1];

            switch (commandActivity){
                case "Collect":
                    if (journal.contains(item)){
                        break;
                    }else{
                        journal.add(item);
                    }
                    break;

                case "Drop":
                    int indexInList = journal.indexOf(item);
                    if (journal.contains(item)){
                        journal.remove(indexInList);
                    }
                    break;

                case "Combine Items":
                    String[] items = commandArr[1].split("\\:");
                    String oldItem = items[0];
                    String newItem = items[1];
                    int indexOfOldItem = journal.indexOf(oldItem);

                    if (journal.contains(oldItem)){
                        journal.add(indexOfOldItem + 1,newItem);
                    }
                    break;

                case "Renew":
                    if (journal.contains(item)){
                        journal.remove(item);
                        journal.add(journal.size(),item);
                    }
                    break;
            }



            command = scanner.nextLine();
        }
        System.out.println(String.join(", ",journal));
    }
}
