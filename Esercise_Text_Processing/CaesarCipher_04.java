package Exercise_Text_Processing;

import java.util.Scanner;

public class CaesarCipher_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder symbolsStrBuilder = new StringBuilder();

        String input = scanner.nextLine();
        for(char symbol : input.toCharArray()){
            symbol += 3;
            symbolsStrBuilder.append(symbol);
        }
        System.out.println(symbolsStrBuilder);
    }
}
