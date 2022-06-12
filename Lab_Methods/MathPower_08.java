package Lab_Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        int pow = Integer.parseInt(scanner.nextLine());

        double result = gradedNumber(number,pow);

        DecimalFormat df = new DecimalFormat("0.#####");
        System.out.println(df.format(result));
    }

    public static double gradedNumber(double num, int pow){
        double result = Math.pow(num,pow);

        return result;
    }
}
