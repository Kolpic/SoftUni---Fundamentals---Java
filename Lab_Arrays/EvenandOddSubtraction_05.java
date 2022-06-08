package Lab_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EvenandOddSubtraction_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int evenSum = 0;
        int oddSum = 0;

        for (int specificNum : numbers){
            if (specificNum % 2 == 0){
                evenSum += specificNum;
            }else {
                oddSum += specificNum;
            }
        }
        System.out.println(evenSum - oddSum);
    }
}
