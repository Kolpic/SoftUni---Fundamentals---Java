package Exercise_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] numbersLineTwo = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            numbersLineTwo[i] = Integer.parseInt(scanner.nextLine());
            sum += numbersLineTwo[i];
            System.out.print(numbersLineTwo[i] + " ");
        }
        System.out.println(" ");
        System.out.println(sum);
    }
}
