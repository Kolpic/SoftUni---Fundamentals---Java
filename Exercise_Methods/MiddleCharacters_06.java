package Exercises_Methods;

import java.util.Scanner;

public class MiddleCharacters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        System.out.println(returnsString(input));
    }

    private static String returnsString(String input){
        if (input.length() % 2 == 0){
            int length = input.length()/2;
            String[] arr =input.split("");
            String result = (arr[length - 1] +  arr[length]);
            return result;
        }else {
            int length = input.length()/2;
            String[] arr =input.split("");
            String result = (arr[length]);
            return result;
        }

    }
}
