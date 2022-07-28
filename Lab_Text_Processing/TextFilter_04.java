package Lab_Text_Processing;

import java.util.Scanner;

public class TextFilter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for(String banWord : bannedWords){
            if(text.contains(banWord)){
                text = text.replace(banWord,replacement("*",banWord.length()));
            }
        }
        System.out.println(text);
    }
    public static String replacement(String s, int n){
        String result = "";
        for (int i = 0; i < n; i++) {
            result += s;
        }
        return result;
    }
}
