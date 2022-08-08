package Exercise_Regular_Expressions;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String names = scanner.nextLine();
        List<String> namesList = Arrays.stream(names.split(", ")).collect(Collectors.toList());

        Map<String,Integer> mapRacers = new LinkedHashMap<>();
        namesList.forEach(name -> mapRacers.put(name,0));

        String namesRegex = "(?<name>[A-Za-z]+)";
        String distanceRegex = "(?<distance>[\\d])";

        Pattern patternNames = Pattern.compile(namesRegex);
        Pattern patternDistances = Pattern.compile(distanceRegex);

        String input = scanner.nextLine();
        while(!input.equals("end of race")){
            Matcher matcherNames = patternNames.matcher(input);
            Matcher matcherDistances = patternDistances.matcher(input);

            StringBuilder namesRacers = new StringBuilder();
            while (matcherNames.find()){
                namesRacers.append(matcherNames.group());
            }

            int distance = 0;
            while (matcherDistances.find()){
                distance += Integer.parseInt(matcherDistances.group());
            }

            String currentRacerName = namesRacers.toString();
            if (mapRacers.containsKey(currentRacerName)){
                int currentDistance = mapRacers.get(currentRacerName);
                mapRacers.put(currentRacerName,currentDistance + distance);
            }

            input = scanner.nextLine();
        }
        List<String> namesOfFirstThree = mapRacers.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());

        System.out.println("1st place: " + namesOfFirstThree.get(0));
        System.out.println("2nd place: " + namesOfFirstThree.get(1));
        System.out.println("3rd place: " + namesOfFirstThree.get(2));
    }
}
