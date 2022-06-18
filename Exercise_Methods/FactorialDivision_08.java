package Exercises_Methods;

import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numberOne = Integer.parseInt(scanner.nextLine());
        double numberTwo = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.2f",FirstFactorial(numberOne) / SecondFactorial(numberTwo));
    }

    private static double FirstFactorial(double num){
        double result = 1;
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
        return result;
    }

    private static double SecondFactorial(double num){
        double result = 1;
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
        return result;
    }
}
