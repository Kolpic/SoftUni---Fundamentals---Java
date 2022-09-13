package Final_Exam_Preparation_23_March_2022;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String places = scanner.nextLine();

        Pattern pattern = Pattern.compile("([=|\\/])(?<destination>[A-Z][A-z]{2,})\\1");
        Matcher matcher = pattern.matcher(places);

        int totalLength = 0;
        List<String> listDestinations = new ArrayList<>();

        while(matcher.find()){
            String currentDestination = matcher.group("destination");
            listDestinations.add(currentDestination);
            int length = matcher.group("destination").length();
            totalLength += length;
        }
        System.out.printf("Destinations: %s%n",String.join(", ",listDestinations));
        System.out.printf("Travel Points: %s",totalLength);
    }
}
