package Lab_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersLineOne = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] numbersLineTwo = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean flag = false;
        int sum = 0;

        for (int i = 0; i < numbersLineOne.length; i++) {

            sum += numbersLineOne[i];

            if (numbersLineOne[i] != numbersLineTwo[i]){
                System.out.printf("Arrays are not identical. Found difference at %d index.",i);
                flag = true;
                break;
            }

        }
        if (!flag){
            System.out.printf("Arrays are identical. Sum: %d",sum);
        }
    }
}
