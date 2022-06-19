package Exercises_Methods;

import java.util.Scanner;

public class TopNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            if (isSumOfDigitsDevBy8(i) && oddDigit(i)){
                System.out.println(i);
            }else {
                continue;
            }
        }
    }

    private static boolean isSumOfDigitsDevBy8(int num){
        int sumDigits = 0;

        while(num > 0){
            int lastDigit = num % 10;
            sumDigits += lastDigit;
            num = num /10;
        }
        return sumDigits % 8 == 0;
    }

    private static boolean oddDigit(int num){
        while(num > 0){
            int lastDigit = num % 10;
            if (lastDigit % 2 == 1){
                return true;
            }
            num = num /10;
        }
        return false;
    }
}
