package Exercise_Arrays;

import java.util.Scanner;

public class ArrayRotation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbersInLine = scanner.nextLine().split(" ");
        int rotations = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= rotations; i++) {
            String firstNumber = numbersInLine[0];
            for (int j = 0; j < numbersInLine.length - 1; j++) {
                numbersInLine[j] = numbersInLine[j + 1];
            }
            numbersInLine[numbersInLine.length-1] = firstNumber;
        }
        System.out.println(String.join(" ",numbersInLine));
    }
}

