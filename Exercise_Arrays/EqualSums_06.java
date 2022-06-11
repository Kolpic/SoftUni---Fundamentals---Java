package Exercise_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersLineOne = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int index = 0; index < numbersLineOne.length - 1;index++) {
            int currentElement = numbersLineOne[index];
            int leftSum = 0;
            int rightSum = 0;

            for (int leftIndex = 0; leftIndex < index; leftIndex++) {
                leftSum += numbersLineOne[leftIndex];
            }

            for (int rightIndex = index + 1; rightIndex <= numbersLineOne.length - 1; rightSum++) {
                rightSum += numbersLineOne[rightIndex];
            }

            if (leftSum == rightSum){
                System.out.println(index);
                break;
            }else {
                System.out.println("no");
            }
        }
    }
}
