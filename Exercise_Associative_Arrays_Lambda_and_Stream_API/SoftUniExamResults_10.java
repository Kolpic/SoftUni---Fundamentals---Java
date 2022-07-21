package Exercise_Associative_Arrays_Lambda_and_Stream_API;

import java.util.*;

public class SoftUniExamResults_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Integer> nameAndPointsMap = new LinkedHashMap<>();
        Map<String,Integer> languageMap = new LinkedHashMap<>();

        while(!input.equals("exam finished")){
            String username = input.split("-")[0];
            String language = input.split("-")[1];

            if (language.equals("banned")){
                nameAndPointsMap.remove(username);
            }else{
                int points =Integer.parseInt(input.split("-")[2]);

                if (!nameAndPointsMap.containsKey(username)){
                    nameAndPointsMap.put(username,points);
                }else {
                    int currentPoints = nameAndPointsMap.get(username);
                    if (currentPoints < points){
                        nameAndPointsMap.put(username,points);
                    }
                }

                if (!languageMap.containsKey(language)){
                    languageMap.put(language,1);
                }else{
                    languageMap.put(language,languageMap.get(language) + 1);
                }
            }
            input = scanner.nextLine();
        }
        System.out.println("Results:");
        nameAndPointsMap.entrySet()
                .forEach(e -> System.out.println(e.getKey() + " | " + e.getValue()));

        System.out.println("Submissions:");
        languageMap.entrySet()
                .forEach(e -> System.out.println(e.getKey() + " - " + e.getValue()));
    }
}

