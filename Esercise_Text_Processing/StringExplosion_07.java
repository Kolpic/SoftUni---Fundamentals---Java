package Exercise_Text_Processing;

import java.util.Scanner;

public class StringExplosion_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();// abv>1>1>2>2asdasd
        StringBuilder inputModification = new StringBuilder(input);

        int totalsSymbolsToRemove = 0;
        for (int i = 0; i < inputModification.length(); i++) {
            char currentSymbol = inputModification.charAt(i);
            if (currentSymbol == '>'){
                int symbolsToRemove =Integer.parseInt(inputModification.charAt(i+1) + "");
                totalsSymbolsToRemove += symbolsToRemove;
            }else if (currentSymbol != '>' && totalsSymbolsToRemove > 0){
                inputModification.deleteCharAt(i);
                totalsSymbolsToRemove--;
                i--;
            }
        }
        System.out.println(inputModification);
    }
}
