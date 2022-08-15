package Final_Exam_My_Final_Exam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SecondTask_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Pattern pattern = Pattern.compile("^([$%])(?<tag>[A-Z][a-z]{2,})\\1: (?<first>\\[[0-9]+\\])\\|(?<second>\\[[0-9]+\\])\\|(?<third>\\[[0-9]+\\])\\|$");

        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            Matcher matcher = pattern.matcher(command);
            if (matcher.find()){
                String tag = matcher.group("tag");
                String first = matcher.group("first");
                first = first.replace("[","");
                first = first.replace("]","");

                String second = matcher.group("second");
                second = second.replace("[","");
                second = second.replace("]","");

                String third = matcher.group("third");
                third = third.replace("[","");
                third = third.replace("]","");

                int firstNum = Integer.parseInt(first);
                int secondNum = Integer.parseInt(second);
                int thirdNum = Integer.parseInt(third);
                StringBuilder builder = new StringBuilder();
                char firstChar = (char) firstNum;
                builder.append(firstChar);
                char secondChar = (char) secondNum;
                builder.append(secondChar);
                char thirdChar = (char) thirdNum;
                builder.append(thirdChar);

                System.out.printf("%s: %s%n",tag,builder);
            }else {
                System.out.println("Valid message not found!");
            }
        }
    }
}
