package More_Exercise_Basic_Syntax_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class GamingStore_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = Double.parseDouble(scanner.nextLine());
        double money = balance;

        double OutFall4price = 39.99;
        double CSOG = 15.99;
        double ZplinterZell = 19.99;
        double Honored2 = 59.99;
        double RoverWatch = 29.99;
        double RoverWatchOriginsEdition = 39.99;

        boolean flag = false;

        String command = scanner.nextLine();
        while (!command.equals("Game Time")){
            if (money <= 0){
                System.out.println("Out of money!");
                flag = true;
            }
            if (command.equals("OutFall 4")){
                if(money < OutFall4price){
                    System.out.println("Too Expensive");
                    command = scanner.nextLine();
                    continue;
                }else {
                    money -= 39.99;
                    System.out.println("Bought OutFall 4");
                    if (money <= 0){
                        System.out.println("Out of money!");
                        flag = true;
                    }
                }
            }else if (command.equals("CS: OG")){
                if(money < CSOG){
                    System.out.println("Too Expensive");
                    command = scanner.nextLine();
                    continue;
                }else {
                    money -= 15.99;
                    System.out.println("Bought CS: OG");
                    if (money <= 0){
                        System.out.println("Out of money!");
                        flag = true;
                    }
                }
            }else if (command.equals("Zplinter Zell")){
                if(money < ZplinterZell){
                    System.out.println("Too Expensive");
                    command = scanner.nextLine();
                    continue;
                }else {
                    money -= 19.99;
                    System.out.println("Bought Zplinter Zell");
                    if (money <= 0){
                        System.out.println("Out of money!");
                        flag = true;
                    }
                }
            }else if (command.equals("Honored 2")){
                if(money < Honored2){
                    System.out.println("Too Expensive");
                    command = scanner.nextLine();
                    continue;
                }else {
                    money -= 59.99;
                    System.out.println("Bought Honored 2");
                    if (money <= 0){
                        System.out.println("Out of money!");
                        flag = true;
                    }
                }
            }else if (command.equals("RoverWatch")){
                if(money < RoverWatch){
                    System.out.println("Too Expensive");
                    command = scanner.nextLine();
                    continue;
                }else {
                    money -= 29.99;
                    System.out.println("Bought RoverWatch");
                    if (money <= 0){
                        System.out.println("Out of money!");
                        flag = true;
                    }
                }
            }else if (command.equals("RoverWatch Origins Edition")){
                if(money < RoverWatchOriginsEdition){
                    System.out.println("Too Expensive");
                    command = scanner.nextLine();
                    continue;
                }else {
                    money -= 39.99;
                    System.out.println("Bought RoverWatch Origins Edition");
                    if (money <= 0){
                        System.out.println("Out of money!");
                        flag = true;
                    }
                }
            }else{
                System.out.println("Not Found");
            }


                command = scanner.nextLine();
        }
        if (!flag) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", balance - money, money);
        }
    }
}
