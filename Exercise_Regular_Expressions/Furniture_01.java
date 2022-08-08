package Exercise_Regular_Expressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String input = scanner.nextLine();
//        Pattern pattern = Pattern.compile("^>>(?<furniture>\\w+)<<(?<price>[0-9]+\\.[0-9]+|[0-9]+)!(?<count>\\d+)$");
//        Matcher matcher = pattern.matcher(input);

        double totalPrice = 0;
        List<String> listOfFurniture = new ArrayList<>();

        Pattern pattern = Pattern.compile(">{2}(?<furniture>[A-Za-z]+)<{2}(?<price>[0-9]+.?[0-9]*)!(?<count>[0-9]+)");

        String input = scanner.nextLine();
        while(!input.equals("Purchase")){
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()){
                String furniture = matcher.group("furniture");
                String price = matcher.group("price");
                String count = matcher.group("count");
                double allPrice = Double.parseDouble(price) * Integer.parseInt(count);

                totalPrice += allPrice;
                listOfFurniture.add(furniture);
            }
            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        listOfFurniture.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f",totalPrice);
    }
}
