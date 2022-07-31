package Exercise_Text_Processing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ValidUsernames_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        for (int i = 0; i < input.length; i++) {

            String currentWord = input[i];
            int currentLength = currentWord.length();

            if (currentLength >= 3 && currentLength <= 16) {
                if(checkChar(currentWord)){
                    System.out.println(currentWord);
                }
            }

        }
    }
    private static boolean checkChar(String name){
        for(char symbol : name.toCharArray()){
            if(!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_'){
                return false;
            }
        }
        return true;
    }
}


