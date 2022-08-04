package Exercise_Text_Processing;

import java.util.Scanner;

public class LettersChangeNumbers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        double totalSum = 0;
        for(String code : input){
            double currentSum = 0;
            currentSum = getCode(code);
            totalSum += currentSum;
        }
        System.out.printf("%.2f",totalSum);
    }

    private static double getCode(String code) {
        char firstLetter = code.charAt(0);
        char lastLetter = code.charAt(code.length() - 1);
        double number = Double.parseDouble(code.replace(firstLetter,' ')
                                           .replace(lastLetter,' ')
                                           .trim());
        if(Character.isUpperCase(firstLetter)){
            int position = firstLetter - 64;
            number /= position;
        }else {
            int position = firstLetter - 96;
            number *= position;
        }
        if(Character.isUpperCase(lastLetter)){
            int position = lastLetter - 64;
            number -= position;
        }else {
            int position = lastLetter - 96;
            number += position;
        }
        return  number;
    }
}
