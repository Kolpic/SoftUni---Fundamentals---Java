package More_Exercise_Basic_Syntax_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class ReverseString_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String eman = "";


        for (int i = name.length() - 1; i >= 0; i--) {
            char currentChar = name.charAt(i);
             eman += currentChar;
        }
        System.out.println(eman);


    }
}
