package Exercise_Associative_Arrays_Lambda_and_Stream_API;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsinString_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        Map<Character,Integer> counterChars = new LinkedHashMap<>();

        for(char symbol : input.toCharArray()){
            if (symbol == ' '){
                continue;
            }
            if (!counterChars.containsKey(symbol)){
                counterChars.put(symbol,1);
            }else{
                int currentValueOfChar = counterChars.get(symbol);
                counterChars.put(symbol,currentValueOfChar + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : counterChars.entrySet()) {
            System.out.printf("%s -> %d%n",entry.getKey(),entry.getValue());
        }
    }
}
