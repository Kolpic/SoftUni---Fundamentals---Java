package Mid_Exam_Preparation_20_June_2022;

import java.util.Scanner;

public class ComputerStore_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String price = scanner.nextLine();

        double totalPrice = 0;

        while (true){
            if (price.equals("special") || price.equals("regular")){
                break;
            }

            double priceInt = Double.parseDouble(price);

            if (priceInt <= 0){
                System.out.println("Invalid price!");
                priceInt = 0;
            }
            totalPrice += priceInt;


            price = scanner.nextLine();

        }
        boolean flag = false;

        if (totalPrice == 0){
            System.out.println("Invalid order!");
            flag = true;
        }


        double taxes = totalPrice * 0.2;
        double finalSum = totalPrice + taxes;


        if(price.equals("special") && !flag){
            double taxesForSpecial = finalSum * 0.1;
            double finalSumForSpecial = finalSum - taxesForSpecial;

            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n",totalPrice);
            System.out.printf("Taxes: %.2f$%n",taxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$",finalSumForSpecial);
        }
        if (price.equals("regular") && !flag) {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", totalPrice);
            System.out.printf("Taxes: %.2f$%n", taxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$", finalSum);
        }
    }
}
