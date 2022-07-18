package Exercise_Associative_Arrays_Lambda_and_Stream_API;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Map<String,Double> productPrices = new LinkedHashMap<>();
        Map<String,Double> productsQuantity = new LinkedHashMap<>();

        while(!command.equals("buy")){
            String[] commandArr = command.split(" ");
            String product = commandArr[0];
            double price = Double.parseDouble(commandArr[1]);
            double quantity =Double.parseDouble(commandArr[2]);

            productPrices.put(product,price);

            if (!productsQuantity.containsKey(product)) {
                productsQuantity.put(product, quantity);
            }else{
                productsQuantity.put(product,productsQuantity.get(product) + quantity);
            }

            command = scanner.nextLine();
        }
        for (Map.Entry<String, Double> entry : productPrices.entrySet()) {
            double finalSum = productsQuantity.get(entry.getKey()) * entry.getValue();
            System.out.printf("%s -> %.2f%n",entry.getKey(),finalSum);
        }

    }
}
