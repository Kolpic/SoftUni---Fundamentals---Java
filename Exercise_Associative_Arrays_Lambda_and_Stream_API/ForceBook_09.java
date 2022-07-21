package Exercise_Associative_Arrays_Lambda_and_Stream_API;

import java.util.*;

public class ForceBook_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Map<String, List<String>> forcesMap = new LinkedHashMap<>();

        while (!command.equals("Lumpawaroo")){
            if (command.contains("|")){
                String forceSide = command.split(" \\| ")[0];
                String forceUser = command.split(" \\| ")[1];

                if (!forcesMap.containsKey(forceSide)){
                        forcesMap.put(forceSide,new ArrayList<>());
                }
                boolean existing = false;

                for(List<String> playerList : forcesMap.values()){
                    if(playerList.contains(forceUser)){
                        existing= true;
                    }
                }
                if (!existing){
                    forcesMap.get(forceSide).add(forceUser);
                }

            }else if (command.contains("->")){
                String forceUser = command.split(" -> ")[0];
                String forceSide = command.split(" -> ")[1];

                forcesMap.entrySet().forEach(entry -> entry.getValue().remove(forceUser));

                if (forcesMap.containsKey(forceSide)) {
                    List<String> currentPlayers = forcesMap.get(forceSide);
                    currentPlayers.add(forceUser);
                } else {
                    forcesMap.put(forceSide, new ArrayList<>());
                    forcesMap.get(forceSide).add(forceUser);
                }
                System.out.printf("%s joins the %s side!%n",forceUser,forceSide);
            }
            command = scanner.nextLine();
        }
        forcesMap.entrySet().stream().filter(entry -> entry.getValue().size() > 0)
                .forEach(entry -> {
                    System.out.printf("Side: %s, Members: %d%n",entry.getKey(),entry.getValue().size());
                    entry.getValue().forEach(player -> System.out.println("! " + player));
                });
    }
}
