package Mid_Exam_Preparation_6;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingListWithList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> shoppingList =
                Arrays.stream(scanner.nextLine().split("\\!")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while(!command.equals("Go Shopping!")){
            String[] commandArr = command.split(" ");
            String item = commandArr[1];

            switch (commandArr[0]){
                case "Urgent":
                    if (shoppingList.contains(item)){
                        break;
                    }else{
                        shoppingList.add(0,item);
                    }
                    break;

                case "Unnecessary":
                    if (shoppingList.contains(item)){
                        shoppingList.remove(item);
                    }
                    break;

                case "Correct":
                    String oldItem = commandArr[1];
                    String newItem = commandArr[2];

                    if (shoppingList.contains(oldItem)){
                        int index = shoppingList.indexOf(oldItem);
                        shoppingList.set(index,newItem);
                    }
                    break;

                case "Rearrange":
                    if (shoppingList.contains(item)){
                        int index = shoppingList.indexOf(item);
                        shoppingList.remove(item);
                        shoppingList.add(shoppingList.size(),item);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println(String.join(", ",shoppingList));
    }
}
