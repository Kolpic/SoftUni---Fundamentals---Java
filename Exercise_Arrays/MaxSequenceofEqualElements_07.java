package Exercise_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceofEqualElements_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int counter = 1;
        int maxLength = 0;
        int startIndex = 0;
        int bestStartIndex = 0;

        for (int index = 1; index <= numbers.length - 1; index++) {
            if (numbers[index] == numbers[index - 1]){
                counter++;
            }else{
                counter = 1;
                startIndex = index;
            }

            if (counter > maxLength){
                maxLength = counter;
                bestStartIndex = startIndex;
            }
        }
        for (int i = bestStartIndex; i < bestStartIndex + maxLength; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
