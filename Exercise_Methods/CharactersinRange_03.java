package Exercises_Methods;

import java.util.Scanner;

public class CharactersinRange_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);

        printCharacters(first,second);
    }

    private static void printCharacters(char one,char two){

        for (int i = one + 1; i < two; i++) {
            System.out.print((char)i + " ");
        }
        for (int i = two + 1; i < one; i++) {
            System.out.print((char)i + " ");
        }
    }
}
