package Exercise_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] firstArr = new int[n];
        int[] secondArr = new int[n];

        for (int i = 1; i <= n; i++) {
            String[] numbers = scanner.nextLine().split(" ");

            int firstNumber = Integer.parseInt(numbers[0]);
            int secondNumber = Integer.parseInt(numbers[1]);

            if (i % 2 == 0){
                firstArr[i - 1] = secondNumber;
                secondArr[i - 1] = firstNumber;
            }else {
                firstArr[i - 1] = firstNumber;
                secondArr[i - 1] = secondNumber;
            }
        }
        for(int number:firstArr){
            System.out.print(number + " ");
        }
        System.out.println(" ");

        for(int number:secondArr){
            System.out.print(number + " ");
        }
    }
}
