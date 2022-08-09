package Exercise_Regular_Expressions;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StarEnigma_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> planetsA = new ArrayList<>();
        List<String> planetsB = new ArrayList<>();

        Pattern pattern = Pattern.compile("@(?<planetName>[A-z]+)[^@\\-?:>]?:?(?<population>\\d+)[^@\\-!:>]?!?(?<type>[AD])!?[^@\\-?:>]?->?(?<soldierCount>\\d+)");

        while (n != 0){
            String command = scanner.nextLine();
            int counter = 0;
            for (int i = 0; i < command.length(); i++) {
                char currentSymbol = command.charAt(i);
                switch (currentSymbol){
                    case 's':
                    case 't':
                    case 'a':
                    case 'r':
                    case 'S':
                    case 'T':
                    case 'A':
                    case 'R':
                        counter++;
                        break;
                }
            }
            StringBuilder newDecryption = new StringBuilder();
            for (int i = 0; i < command.length(); i++) {
                char currentSymbol = command.charAt(i);
                char newSymbol = (char) (currentSymbol - counter);
                newDecryption.append(newSymbol);
            }
            String newCommand = newDecryption.toString();
            Matcher matcher = pattern.matcher(newCommand);
            if (matcher.find()){
                String symbolOfType = matcher.group("type");
                String nameOfThePlanet = matcher.group("planetName");
                if (symbolOfType.equals("A")){
                    planetsA.add(nameOfThePlanet);
                }else{
                    planetsB.add(nameOfThePlanet);
                }
            }

            n--;
        }
        System.out.printf("Attacked planets: %d%n",planetsA.size());
        Collections.sort(planetsA);
        planetsA.forEach(planet -> System.out.println("-> " + planet));

        System.out.printf("Destroyed planets: %d%n",planetsB.size());
        Collections.sort(planetsB);
        planetsB.forEach(planet -> System.out.println("-> " + planet));

    }
}
