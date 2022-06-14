package Exercises_Methods;

import java.util.Scanner;

public class SmallestofThreeNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());
        int numberThree = Integer.parseInt(scanner.nextLine());

        printSmallestNumberOutOfThreeNumbers(numberOne,numberTwo,numberThree);
    }

    private static void printSmallestNumberOutOfThreeNumbers(int num1,int num2,int num3){
        if (num1 <= num2 && num1 <= num3){
            System.out.println(num1);
        }else if (num2 <= num1 && num2 <= num3){
            System.out.println(num2);
        }else if (num3 <= num2 && num3 <= num2){
            System.out.println(num3);
        }
    }
}
