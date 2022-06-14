package Exercises_Methods;

import java.util.Scanner;

public class PasswordValidator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        if (!boolCharacters(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!boolLettersOrDigits(password)){
            System.out.println("Password must consist only of letters and digits");
        }
        if (!boolDigits(password)){
            System.out.println("Password must have at least 2 digits");
        }

        if (boolCharacters(password) && boolLettersOrDigits(password) && boolDigits(password)) {
            System.out.println("Password is valid");
        }
    }

    private static boolean boolCharacters(String password) {
        if (password.length() >= 6 && password.length() <= 10) {
            return true;
        }
        return false;
    }

    private static boolean boolLettersOrDigits(String password) {
        for (char symbol : password.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)) {
                return false;
            }
        }
        return true;
    }

    private static boolean boolDigits(String password){
        int counter = 0;
        for(char symbol : password.toCharArray()){
            if (Character.isDigit(symbol)){
                counter++;
            }
        }
        if (counter >= 2){
            return true;
        }else {
            return false;
        }

    }
}
