package Lab_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArraytoNumber_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

//        int num = 0;
//        for (int i = 0; i <= numbers[numbers.length - 1]; i++) {
//            int condensed[] = new int[numbers.length - 1];
//            condensed[i] = numbers[i] + numbers[i+1];
//            numbers[i] = condensed[i];
//            num = condensed[i];
//        }
//        System.out.println(num);

        while(numbers.length > 1){
            int condensed[] = new int[numbers.length - 1];
            for (int i = 0; i < numbers.length - 1; i++) {
                condensed[i] = numbers[i] + numbers[i+1];
            }
            numbers = condensed;
        }
        System.out.print(numbers[0]);
    }
}
