package Exercise_Basic_Syntax_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String password = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            char currentChar = name.charAt(i);
            password = password + currentChar;
        }

        String enterPassword = scanner.nextLine();
        int count = 0;
        boolean flag = false;

        while (!enterPassword.equals(password)){
            count++;
            if (count == 4){
                System.out.printf("User %s blocked!",name);
                flag = true;
                break;
            }

            System.out.println("Incorrect password. Try again.");
            enterPassword = scanner.nextLine();
        }
        if (!flag){
        System.out.printf("User %s logged in.",name);}
    }
}
