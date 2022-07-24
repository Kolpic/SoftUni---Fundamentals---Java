package Lab_Text_Processing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepeatStrings_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> words = new ArrayList<>();

        String[] inputArr = scanner.nextLine().split(" ");
        String res = "";
        for (int i = 0; i < inputArr.length; i++) {
            String currentWord = inputArr[i];
            int length = currentWord.length();
            res = getNWord(currentWord,length);
            words.add(res);
        }
        System.out.println(String.join("",words));
    }
    public static String getNWord(String string, int n){
        String result = "";
        for (int i = 0; i < n; i++) {
            result += string;
        }
        return result;
    }
}
