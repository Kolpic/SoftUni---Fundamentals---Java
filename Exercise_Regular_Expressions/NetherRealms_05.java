package Exercise_Regular_Expressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetherRealms_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(",\\s+");
        Pattern pattern = Pattern.compile("[^\\d+\\-*.\\\\/]");
        Pattern digits = Pattern.compile("-?\\d+\\.?\\d*");

        for (int i = 0; i < input.length; i++) {
            String currentWord = input[i];
            Matcher matcher = pattern.matcher(currentWord);

            int totalSumHealth = 0;
            if (matcher.find()){
                for (int j = 0; j < currentWord.length(); j++) {
                    char currentChar = currentWord.charAt(j);
                    if ((currentChar >= 65 && currentChar <= 90) || (currentChar >= 97 && currentChar <= 122)){
                        totalSumHealth += currentChar;
                    }
                }
                Matcher digitsMatcher = digits.matcher(currentWord);

                double sumDamage = 0;
                while (digitsMatcher.find()){
                    double currentDigit =Double.parseDouble(digitsMatcher.group());
                    sumDamage += currentDigit;
                }

                for (int k = 0; k < currentWord.length(); k++) {
                    char currentChar = currentWord.charAt(k);
                    if (currentChar == 42){
                        sumDamage *= 2;
                    }else if (currentChar == 47){
                        sumDamage /= 2;
                    }
                }
                System.out.printf("%s - %d health, %.2f damage%n",currentWord,totalSumHealth,sumDamage);
            }
//            Matcher digitsMatcher = digits.matcher(currentWord);
//
//            double sumDamage = 0;
//            while (digitsMatcher.find()){
//                double currentDigit =Double.parseDouble(digitsMatcher.group());
//                sumDamage += currentDigit;
//            }
//
//            for (int k = 0; k < currentWord.length(); k++) {
//                char currentChar = currentWord.charAt(k);
//                if (currentChar == 42){
//                    sumDamage *= 2;
//                }else if (currentChar == 47){
//                    sumDamage /= 2;
//                }
//            }
//            System.out.printf("%s - %d health, %.2f damage%n",currentWord,totalSumHealth,sumDamage);
        }
    }
}
