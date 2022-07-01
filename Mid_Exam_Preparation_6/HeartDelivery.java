package Mid_Exam_Preparation_6;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> neighborhood = Arrays
                .stream(scanner.nextLine().split("\\@"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        int lastPlaceIndex = 0;

        int startPosition = 0;
        while(!command.equals("Love!")){
            String[] commandArr = command.split(" ");
            int jump = Integer.parseInt(commandArr[1]);

            while (true){
                int index = startPosition + jump;

                lastPlaceIndex = index;

                if (index > neighborhood.size()-1){
                    index = 0;
                }
                int currentValue = neighborhood.get(index);
                if (currentValue == 0){
                    System.out.printf("Place %d already had Valentine's day.%n",index);
                }else {
                    int resultAfterLove = currentValue - 2;
                    if (resultAfterLove == 0) {
                        System.out.printf("Place %d has Valentine's day.%n", index);
                        neighborhood.set(index, resultAfterLove);
                    }
                    neighborhood.set(index, resultAfterLove);
                }
                startPosition = index;
                break;
            }

            command = scanner.nextLine();
        }
        int counter = 0;

        System.out.printf("Cupid's last position was %d.%n",startPosition);
        for (int i = 0; i <= neighborhood.size() - 1; i++) {
            if (neighborhood.get(i) == 0){
                counter++;
            }
        }
        if (counter == neighborhood.size()){
            System.out.println("Mission was successful.");
        }else{
            System.out.printf("Cupid has failed %d places.%n",neighborhood.size() -  counter);
        }

    }
}
