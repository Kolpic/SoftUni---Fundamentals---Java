package Exercise_Associative_Arrays_Lambda_and_Stream_API;

import java.util.*;

public class CompanyUsers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Map<String, List<String>> companyMap = new LinkedHashMap<>();

        while(!command.equals("End")){
            String[] commandArr = command.split(" -> ");
            String companyName = commandArr[0];
            String id = commandArr[1];

//            companyMap.putIfAbsent(companyName, new ArrayList<>());
//            if (!companyMap.get(companyName).contains(id)) {
//                companyMap.get(companyName).add(id);
//            }

            if (!companyMap.containsKey(companyName)){
                companyMap.put(companyName,new ArrayList<>());
                companyMap.get(companyName).add(id);
            }else{
                if (!companyMap.get(companyName).contains(id)) {
                    companyMap.get(companyName).add(id);
                }
            }


            command = scanner.nextLine();
        }
        companyMap.entrySet()
                .forEach(entry -> {
                    System.out.println(entry.getKey());
                    entry.getValue().forEach(id -> System.out.println("-- " + id));
                });
    }
}
