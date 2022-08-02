package Exercise_Text_Processing;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumber_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        BigInteger numOne = new BigInteger(scanner.nextLine());
//        BigInteger numTwo = new BigInteger(scanner.nextLine());
//
//        System.out.println(numOne.multiply(numTwo));

        String numberOne = scanner.nextLine();
        int numberTwo = Integer.parseInt(scanner.nextLine());

        StringBuilder mulNumbers = new StringBuilder();

        for (int i = numberOne.length() - 1; i >= 0; i--) {
            String currentSymbol = numberOne.split("")[i];
            int currentNum = Integer.parseInt(currentSymbol);
            mulNumbers.append(currentNum * numberTwo);
        }
        mulNumbers.reverse();
        System.out.println(mulNumbers);
    }
}
