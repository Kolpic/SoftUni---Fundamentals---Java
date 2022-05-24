package Lab_Basic_Syntax_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class SumofOddNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int count = 0;

        for (int i = 1; i <= n * 2; i = i + 2) {
            sum = sum + i;
            System.out.println(i);
            count++;
        }
        System.out.printf("Sum: %d%n",sum);
    }
}
