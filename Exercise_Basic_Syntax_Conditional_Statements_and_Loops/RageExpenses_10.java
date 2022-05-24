package Exercise_Basic_Syntax_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class RageExpenses_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double lostGames = Integer.parseInt(scanner.nextLine());
        double headSetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyBoardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double trashedHeadSet =Math.floor((lostGames / 2)) * headSetPrice;
        double trashedMouse =Math.floor((lostGames / 3)) * mousePrice;
        double trashedKeyBoard =Math.floor((lostGames / 6)) * keyBoardPrice;
        double trashedDisplay =Math.floor((lostGames / 12)) * displayPrice;

        double result = trashedHeadSet + trashedMouse + trashedKeyBoard + trashedDisplay;
        System.out.printf("Rage expenses: %.2f lv.",result);

    }
}
