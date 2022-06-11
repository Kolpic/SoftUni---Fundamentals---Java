package Exercise_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= numbers.length - 1; i++) {

            int numberOne = numbers[i];

            for (int j = i + 1; j <= numbers.length - 1; j++) {

                int numberTwo = numbers[j];

                if (numberOne + numberTwo == n){
                    System.out.printf("%d %d%n",numberOne,numberTwo);
            }
            }
        }
    }
}
