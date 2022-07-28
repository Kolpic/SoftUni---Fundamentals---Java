package Lab_Text_Processing;

import java.util.Scanner;

public class Substring_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String wordToRemove = scanner.nextLine();
        String word = scanner.nextLine();

        int index = word.indexOf(wordToRemove);
        while(index != -1){
            word =  word.replace(wordToRemove,"");
            index = word.indexOf(wordToRemove);
        }
        System.out.println(word);
    }
}
