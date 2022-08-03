package Exercise_Text_Processing;

import java.util.Scanner;

public class ReplaceRepeatingChars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        String result = "";

        char first = input.charAt(0);
        result += first;

        for (int i = 1; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);
            if (currentSymbol != first){
                result += currentSymbol;
                first = currentSymbol;
            }
        }
        System.out.println(result);
    }
}
