package Mid_Exam_Preparation_6;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] shoppingList = scanner.nextLine().split("\\!");

        String command = scanner.nextLine();

        boolean flag = false;

        while(!command.equals("Go Shopping!")){
            String[] commandArr = command.split(" ");
            String item = commandArr[1];

            switch (commandArr[0]){
                case "Urgent":
                    flag = false;
                    for(String currentItem:shoppingList) {
                        if (currentItem.equals(item)) {
                            flag = true;
                            break;
                        }
                    }
                    if(!flag) {
                        String[] newShoppingList = new String[shoppingList.length + 1];
                        for (int i = 0; i < newShoppingList.length - 1; i++) {
                            newShoppingList[i + 1] = shoppingList[i];
                        }
                        newShoppingList[0] = item;
                        shoppingList = newShoppingList;
                    }
                    break;

                case "Unnecessary":
                    for (int i = 0; i < shoppingList.length - 1; i++) {
                        if (shoppingList[i].equals(item)){

                        }
                    }
                    break;

                case "Correct":

                    break;

                case "Rearrange":

                    break;
            }


            command = scanner.nextLine();
        }
    }
}
