package Lab_Methods;

import java.util.Scanner;

public class RepeatString_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatingString(text,count));
    }

    public static String repeatingString(String text,int count){
        String result = "";

        for (int i = 1; i <= count; i++) {
            result += text;
        }
        return result;
    }
}
