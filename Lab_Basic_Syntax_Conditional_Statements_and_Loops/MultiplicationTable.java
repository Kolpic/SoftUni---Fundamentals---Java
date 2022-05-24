package Lab_Basic_Syntax_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int multy = Integer.parseInt(scanner.nextLine());

        if (multy >= 11){
            System.out.printf("%d X %d = %d%n",num,multy,num*multy);
        }
        for (int i = multy; multy <= 10; multy++) {
            System.out.printf("%d X %d = %d%n",num,multy,num*multy);
        }

    }
}
