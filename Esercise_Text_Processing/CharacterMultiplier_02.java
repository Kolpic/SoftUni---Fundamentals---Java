package Exercise_Text_Processing;

import java.util.Scanner;

public class CharacterMultiplier_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");

        String firstWord = inputArr[0];
        String secondWord = inputArr[1];

        long sum = lengthBetweenTwoWords(firstWord,secondWord);

        System.out.println(sum);
    }
    private static long lengthBetweenTwoWords(String firstWord,String secondWord){
        char[] first = firstWord.toCharArray();
        char[] second = secondWord.toCharArray();
        int sum = 0;
        int minLength = Math.min(firstWord.length(),secondWord.length());
        int maxLength = Math.max(firstWord.length(),secondWord.length());

        for (int i = 0; i < minLength; i++){
            sum += first[i] * second[i];
        }
        if (maxLength == first.length){
            for (int i = minLength; i < maxLength; i++) {
                sum += first[i];
            }
        }else{
            for (int i = minLength; i < maxLength; i++) {
                sum += second[i];
            }
        }
        return sum;
    }
}
