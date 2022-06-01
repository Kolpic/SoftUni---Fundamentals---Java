package Exercise_Data_Types_and_Variables;

import java.util.Scanner;

public class SumofChars_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 0; i < n; i++) {
            char letters = scanner.nextLine().charAt(0);

            int count = (int) letters;
            sum += count;
        }
        System.out.printf("The sum equals: %d",sum);
    }
}
