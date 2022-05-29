package Lab_Data_Types_and_Variables;

import java.util.Scanner;

public class RefactorSpecialNumbers_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int currentNum = 0;
        boolean flag = false;
        for (int i = 1; i <= num; i++) {
            currentNum = i;
            while (i > 0) {
                sum += i % 10;
                i = i / 10;
            }
            flag = (sum == 5) || (sum == 7) || (sum == 11);
            System.out.printf("%d -> False%n", currentNum, flag);
            sum = 0;
            i = currentNum;
        }

    }
}
