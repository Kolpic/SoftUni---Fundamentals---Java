package Exercise_Associative_Arrays_Lambda_and_Stream_API;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,Integer> quantityCollector = new LinkedHashMap<>();

        String resource = scanner.nextLine();

        while (!resource.equals("stop")){
            int quantity = Integer.parseInt(scanner.nextLine());

            if (!quantityCollector.containsKey(resource)){
                quantityCollector.put(resource,quantity);
            }else{
                int currentQuantity = quantityCollector.get(resource);
                quantityCollector.put(resource,quantity + currentQuantity);
            }
            resource = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : quantityCollector.entrySet()) {
            System.out.printf("%s -> %d%n",entry.getKey(),entry.getValue());
        }
    }
}
