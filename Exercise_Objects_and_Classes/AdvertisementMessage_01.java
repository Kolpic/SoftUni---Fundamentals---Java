package Exercise_Objects_and_Classes;

import java.util.*;

public class AdvertisementMessage_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> listOfPhrases = new ArrayList<>();

        listOfPhrases.add("Excellent product.");
        listOfPhrases.add("Such a great product.");
        listOfPhrases.add("I always use that product.");
        listOfPhrases.add("Best product of its category.");
        listOfPhrases.add("Exceptional product.");
        listOfPhrases.add("I can’t live without this product.");

        List<String> listOfEvents = new ArrayList<>();

        listOfEvents.add("Now I feel good.");
        listOfEvents.add("I have succeeded with this product.");
        listOfEvents.add("Makes miracles. I am happy of the results!");
        listOfEvents.add("I cannot believe but now I feel awesome.");
        listOfEvents.add("Try it yourself, I am very satisfied.");
        listOfEvents.add("I feel great!");

        List<String> listOfAuthors = new ArrayList<>();

        listOfAuthors.add("Diana");
        listOfAuthors.add("Petya");
        listOfAuthors.add("Stella");
        listOfAuthors.add("Elena");
        listOfAuthors.add("Katya");
        listOfAuthors.add("Iva");
        listOfAuthors.add("Annie");
        listOfAuthors.add("Eva");

        List<String> listOfCity = new ArrayList<>();

        listOfCity.add("Burgas");
        listOfCity.add("Sofia");
        listOfCity.add("Plovdiv");
        listOfCity.add("Varna");
        listOfCity.add("Ruse");

        Random rd = new Random();
        while(n != 0){

            int indexForPhrases = rd.nextInt(listOfPhrases.size());
            int indexForEvents = rd.nextInt(listOfEvents.size());
            int indexForAuthors = rd.nextInt(listOfAuthors.size());
            int indexForCity = rd.nextInt(listOfCity.size());

            System.out.printf("%s %s %s – %s.%n",listOfPhrases.get(indexForPhrases),
                    listOfEvents.get(indexForEvents), listOfAuthors.get(indexForAuthors),
                    listOfCity.get(indexForCity));
            n--;
        }
    }
}
