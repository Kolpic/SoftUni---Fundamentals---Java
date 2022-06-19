package Exercises_Methods;

import java.util.Scanner;

public class PalindromeIntegers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while(!input.equals("END")){
            String secondString = "";
            String firstString = input;

            String[] arr =input.split("");

            for (int i = arr.length - 1; i >= 0; i--) {
                secondString = secondString + arr[i];
            }
            if (firstString.equals(secondString)){
                System.out.println("true");
            }else {
                System.out.println("false");
            }

            input = scanner.nextLine();
        }
    }
}
