package Exercises_Methods;

import java.util.Scanner;

public class AddandSubtract_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());
        int numberThree = Integer.parseInt(scanner.nextLine());

        int sum = sum(numberOne,numberTwo);
        int res = sum - numberThree;
        System.out.println(res);
    }

    private static int sum(int numOne, int numTwo){
        int result = numOne + numTwo;;
        return result;
    }
}
