package Final_Exam_My_Final_Exam;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        String command = scanner.nextLine();

        while (!command.equals("End")){
            switch (command.split(" ")[0]){
                case"Translate":
                    String symbol = command.split(" ")[1];
                    String replacement = command.split(" ")[2];

                    word = word.replace(symbol,replacement);

                    System.out.println(word);
                    break;

                case"Includes":
                    String substring = command.split(" ")[1];
                    if (word.contains(substring)){
                        System.out.println("True");
                    }else {
                        System.out.println("False");
                    }
                    break;

                case"Start":
                    String startSubstring = command.split(" ")[1];
                    if (word.startsWith(startSubstring)){
                        System.out.println("True");
                    }else {
                        System.out.println("False");
                    }
                    break;

                case"Lowercase":
                    word = word.toLowerCase();
                    System.out.println(word);
                    break;

                case"FindIndex":
                    String letter = command.split(" ")[1];
                    int place =  word.lastIndexOf(letter);
                    System.out.println(place);
                    break;

                case"Remove":
                    int startIndex = Integer.parseInt(command.split(" ")[1]);
                    int count = Integer.parseInt(command.split(" ")[2]);

                    StringBuilder builder = new StringBuilder(word);
//                    for (int i = startIndex; i < count + startIndex; i--) {
//                        builder.deleteCharAt(i);
//                    }
                    builder.delete(startIndex,count + startIndex);
//                    builder.replace(startIndex,count + 1,"");
                    word = builder.toString();
                    System.out.println(word);
                    break;
            }

            command = scanner.nextLine();
        }
    }
}
