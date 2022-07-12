package Lab_Associative_Arrays_Lambda_and_Stream_API;

import java.util.*;

public class OddOccurrences_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");

        Map<String,Integer> stringsMap = new LinkedHashMap<>();

        for (int i = 0; i < inputArr.length; i++) {
            String currentWord = inputArr[i].toLowerCase();
            Integer currentValue = stringsMap.get(currentWord);

            if(stringsMap.containsKey(currentWord)){
                stringsMap.put(currentWord,currentValue + 1);
            }else {
                stringsMap.put(currentWord,1);
            }
        }
        List<String> oddWord = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : stringsMap.entrySet()) {
            if (entry.getValue() % 2 == 1){
                oddWord.add(entry.getKey());
            }
        }
        System.out.println(String.join(", ",oddWord));
    }
}
