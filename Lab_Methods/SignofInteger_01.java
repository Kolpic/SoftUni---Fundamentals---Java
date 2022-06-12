package Lab_Methods;

import java.util.Scanner;

public class SignofInteger_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberToFind = Integer.parseInt(scanner.nextLine());

        findNumber(numberToFind);
    }

    public static void findNumber(int number){

        if (number > 0){
            System.out.printf("The number %d is positive.",number);
        }else if (number < 0){
            System.out.printf("The number %d is negative.",number);
        }else {
            System.out.print("The number 0 is zero.");
        }
    }
}
