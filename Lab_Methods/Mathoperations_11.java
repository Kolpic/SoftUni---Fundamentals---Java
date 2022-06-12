package Lab_Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Mathoperations_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNum = Double.parseDouble(scanner.nextLine());
        String operator = scanner.nextLine();
        double secondNum = Double.parseDouble(scanner.nextLine());
        DecimalFormat df = new DecimalFormat("0.#####");

        switch (operator){
            case "+":
                double result = makeTheMathOperatorForSub(firstNum,secondNum);
                System.out.println(df.format(result));
                break;

            case "-":
                double resultTwo = makeTheMathOperatorForDev(firstNum,secondNum);
                System.out.println(df.format(resultTwo));
                break;

            case "*":
                double resultThree = makeTheMathOperatorForMulty(firstNum,secondNum);
                System.out.println(df.format(resultThree));
                break;

            case "/":
                double resultFour = makeTheMathOperatorForDevis(firstNum,secondNum);
                System.out.println(df.format(resultFour));
                break;
        }

    }

    public static double makeTheMathOperatorForSub(double one,double two){
        return one + two;
    }

    public static double makeTheMathOperatorForDev(double one,double two){
        return one - two;
    }

    public static double makeTheMathOperatorForMulty(double one,double two){
        return one * two;
    }

    public static double makeTheMathOperatorForDevis(double one,double two){
        return one / two;
    }
}
