package More_Exercise_Basic_Syntax_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class SortNumbers_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOne = Integer.parseInt(scanner.nextLine());
        int numTwo = Integer.parseInt(scanner.nextLine());
        int numThree = Integer.parseInt(scanner.nextLine());

        if (numThree > numOne && numThree > numTwo) {
            //System.out.println(numThree);
            if (numOne > numTwo ) {
                System.out.println(numThree);
                System.out.println(numOne);
                System.out.println(numTwo);
            }
        }
        if (numThree > numOne && numThree > numTwo) {
            //System.out.println(numThree);
            if (numTwo > numOne || numOne == numTwo) {
                System.out.println(numThree);
                System.out.println(numTwo);
                System.out.println(numOne);
            }
        }

        if (numTwo > numOne && numTwo > numThree) {
            //System.out.println(numTwo);
            if (numOne > numThree ) {
                System.out.println(numTwo);
                System.out.println(numOne);
                System.out.println(numThree);
            }
        }
        if (numTwo > numOne && numTwo > numThree) {
            //System.out.println(numTwo);
            if (numThree > numOne || numOne == numThree) {
                System.out.println(numTwo);
                System.out.println(numThree);
                System.out.println(numOne);
            }
        }

        if (numOne > numTwo && numOne > numThree) {
            //System.out.println(numOne);
            if (numTwo > numThree ) {
                System.out.println(numOne);
                System.out.println(numTwo);
                System.out.println(numThree);
            }
        }
        if (numOne > numTwo && numOne > numThree) {
            //System.out.println(numOne);
            if (numThree > numTwo || numTwo == numThree) {
                System.out.println(numOne);
                System.out.println(numThree);
                System.out.println(numTwo);
            }
        }

    }
}