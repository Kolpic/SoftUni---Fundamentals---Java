package Lab_Lists;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble).collect(Collectors.toList());



        for (int i = 0; i < numbers.size() -1; i++) {
            double firstElement = numbers.get(i);
            double secondElement = numbers.get(i + 1);

            if (firstElement == secondElement){
                numbers.set(i,numbers.get(i) + numbers.get(i + 1));
                numbers.remove(i + 1);

                i = -1;
            }
        }

        System.out.println(joinsByDelimiter(numbers," "));

    }

    private static String joinsByDelimiter(List<Double> num, String delimiter){
        String result = "";
        for(double number : num){
            DecimalFormat df = new DecimalFormat("0.#");

            String numFormat = df.format(number) + delimiter;

            result += numFormat;
        }
        return result;
    }
}
