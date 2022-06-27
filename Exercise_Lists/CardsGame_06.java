package Exercise_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstHand = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> secondHand = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i < firstHand.size(); i++) {
            if (firstHand.isEmpty() || secondHand.isEmpty()){
                break;
            }
            int firstPlayerCard = firstHand.get(i);
            int secondPlayerCard = secondHand.get(i);

            if (firstPlayerCard > secondPlayerCard) {
                firstHand.add(firstPlayerCard);
                firstHand.add(secondPlayerCard);
                firstHand.remove(i);
                secondHand.remove(i);
                i = -1;
            } else if (secondPlayerCard > firstPlayerCard){
                secondHand.add(secondPlayerCard);
                secondHand.add(firstPlayerCard);
                firstHand.remove(i);
                secondHand.remove(i);
                i = -1;
            }else{
                firstHand.remove(i);
                secondHand.remove(i);
                i = -1;
            }
        }

        int firstPlayerSum = 0;
        for(int num:firstHand){
            firstPlayerSum += num;
        }

        int secondPlayerSum = 0;
        for(int num:secondHand){
            secondPlayerSum += num;
        }
        if (firstPlayerSum > secondPlayerSum){
            System.out.printf("First player wins! Sum: %d",firstPlayerSum);
        }else{
            System.out.printf("Second player wins! Sum: %d",secondPlayerSum);
        }
    }
}
