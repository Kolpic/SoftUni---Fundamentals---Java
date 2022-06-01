package Exercise_Data_Types_and_Variables;

import java.util.Scanner;

public class SumDigits_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int lastDigit = 0;

        while (number > 0){
            lastDigit = number % 10;
            sum += lastDigit;
            number = number / 10;
        }
        System.out.print(sum);
    }
}
