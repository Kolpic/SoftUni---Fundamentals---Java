package Lab_Associative_Arrays_Lambda_and_Stream_API;

import java.util.*;

public class Word_Synonyms_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String,List<String>> mapSynonyms = new LinkedHashMap<>();

        while (n != 0){
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            if (!mapSynonyms.containsKey(word)){
                mapSynonyms.put(word,new ArrayList<>());
                mapSynonyms.get(word).add(synonym);
            }else{
                mapSynonyms.get(word).add(synonym);
            }
            n--;
        }
        for (Map.Entry<String, List<String>> entry : mapSynonyms.entrySet()) {
            System.out.printf("%s - %s%n",entry.getKey(),String.join(", ",entry.getValue()));
        }

    }
}
