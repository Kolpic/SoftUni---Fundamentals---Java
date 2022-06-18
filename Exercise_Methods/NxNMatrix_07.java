package Exercises_Methods;

import java.util.Scanner;

public class NxNMatrix_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        printNxN(n);
    }
    
    private static void printNxN(int number){
        for (int i = 1; i <= number; i++) {
            if (i != 1){
                System.out.println("");
            }
            for (int j = 1; j <= number; j++) {
                System.out.print(number + " ");
            }
        }
    }
}
