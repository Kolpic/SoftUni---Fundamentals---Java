package Exercise_Associative_Arrays_Lambda_and_Stream_API;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String,String> carsMap = new LinkedHashMap<>();

        while (n != 0){
            String[] commandArr = scanner.nextLine().split(" ");
            String typeOfCommand = commandArr[0];
            String name = commandArr[1];

            switch (typeOfCommand){
                case "register":
                    String plate = commandArr[2];
                    if (!carsMap.containsKey(name)){
                        if (!carsMap.containsValue(plate)){
                            carsMap.put(name,plate);
                            System.out.printf("%s registered %s successfully%n",name,plate);
                        }
                    }else {
                            System.out.printf("ERROR: already registered with plate number %s%n",plate);
                    }
                    break;

                case "unregister":
                    if (!carsMap.containsKey(name)){
                        System.out.printf("ERROR: user %s not found%n",name);
                    }else{
                        carsMap.remove(name);
                        System.out.printf("%s unregistered successfully%n",name);
                    }
                    break;
            }
            n--;
        }
        for (Map.Entry<String, String> entry : carsMap.entrySet()) {
            System.out.printf("%s => %s%n",entry.getKey(),entry.getValue());
        }

    }
}
