package Exercise_Regular_Expressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern pattern = Pattern.compile("%(?<name>[A-Z][a-z]+)%[^|$%.]*<(?<product>\\w+)>[A-Za-z]*[^|$%.]*\\|(?<count>\\d+)[^|$%.]*\\|[A-Za-z]*(?<price>[0-9]+.?[0-9]*)\\$");
        double totalIncome = 0;

        String input = scanner.nextLine();
        while (!input.equals("end of shift")){
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()){
                String name = matcher.group("name");
                String product = matcher.group("product");
                double count = Double.parseDouble(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));
                double priceAndCount = count * price;
                totalIncome += priceAndCount;

                System.out.printf("%s: %s - %.2f%n",name,product,priceAndCount);
            }

            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f",totalIncome);
    }
}
