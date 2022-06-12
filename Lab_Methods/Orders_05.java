package Lab_Methods;

import java.net.Inet4Address;
import java.util.Scanner;

public class Orders_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        switch (product){
            case "coffee":
                double priceCoffee = 1.50;
                printPrice(quantity,priceCoffee);
                break;

            case "water":
                double priceWater = 1.00;
                printPrice(quantity,priceWater);
                break;

            case "coke":
                double priceCoke = 1.40;
                printPrice(quantity,priceCoke);
                break;

            case "snacks":
                double priceSnacks = 2.00;
                printPrice(quantity,priceSnacks);
                break;
        }

    }

    public static void printPrice(int quantity,double price){
        double result = quantity * price;
        System.out.printf("%.2f",result);
    }
}
