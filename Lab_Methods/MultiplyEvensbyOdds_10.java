package Lab_Methods;

import java.util.Scanner;

public class MultiplyEvensbyOdds_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int result = getsMultyFromNumbers(number);

        System.out.println(Math.abs(result));
    }
    public static int getsMultyFromNumbers(int numbers){
        int evenSum = 0;
        int oddSum = 0;

        numbers = Math.abs(numbers);

        while (numbers > 0){
            int lastNumber =  numbers % 10;
//            numbers = numbers / 10;

            if (lastNumber % 2 == 0){
                evenSum = evenSum + lastNumber;
            }else {
                oddSum = oddSum + lastNumber;
            }

            numbers = numbers / 10;
        }
        int result = evenSum * oddSum;
        return result;
    }
}
