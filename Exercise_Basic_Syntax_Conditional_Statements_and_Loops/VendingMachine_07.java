package Exercise_Basic_Syntax_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String  command = scanner.nextLine();
        double sumcoins = 0;

        while (!command.equals("Start")){
            double coins = Double.parseDouble(command);
            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2){
                sumcoins += coins;
            }else {
                System.out.printf("Cannot accept %.2f%n",coins);
            }
            command = scanner.nextLine();
        }
        String product = scanner.nextLine();
        double  price = 0;
        double sumprice = 0;

        while (!product.equals("End")){
            boolean hasMoney = true;
            switch (product) {
                case "Nuts":
                    if (sumcoins < 2){
                        System.out.println("Sorry, not enough money");
                        hasMoney = false;
                    }else {
                        sumcoins -= 2;
                    }
                    break;

                case "Water":
                    if (sumcoins < 0.7){
                        System.out.println("Sorry, not enough money");
                        hasMoney = false;
                    }else {
                        sumcoins -= 0.7;
                    }
                    break;

                case "Crisps":
                    if (sumcoins < 1.5){
                        System.out.println("Sorry, not enough money");
                        hasMoney = false;
                    }else {
                        sumcoins -= 1.5;
                    }
                    break;

                case "Soda":
                    if (sumcoins < 0.8){
                        System.out.println("Sorry, not enough money");
                        hasMoney = false;
                    }else {
                        sumcoins -= 0.8;
                    }
                    break;

                case "Coke":
                    if (sumcoins < 1.0){
                        System.out.println("Sorry, not enough money");
                        hasMoney = false;
                    }else {
                        sumcoins -= 1.0;
                    }
                    break;

                default:
                    System.out.println("Invalid product");
                    hasMoney = false;
                    break;

            }

            if (!hasMoney){
                product = scanner.nextLine();
                continue;
            }
            System.out.printf("Purchased %s%n", product);
            product = scanner.nextLine();
        }

        System.out.printf("Change: %.2f", sumcoins);
    }
}
