package Exercise_Associative_Arrays_Lambda_and_Stream_API;

import java.util.*;

public class Courses_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Map<String, List<String>> coursesMap = new LinkedHashMap<>();

        while(!command.equals("end")){
            String[] commandArr = command.split(" : ");
            String module = commandArr[0];
            String name = commandArr[1];

            if (!coursesMap.containsKey(module)){
                coursesMap.put(module,new ArrayList<>());
                coursesMap.get(module).add(name);
            }else{
                coursesMap.get(module).add(name);
            }
            command = scanner.nextLine();
        }
        coursesMap.entrySet()
                .forEach(entry -> {
                    //key: име на курса
                    //value: списък с хората
                    //име на курса -> бр. хората
                    System.out.println(entry.getKey() + ": " + entry.getValue().size());
                    entry.getValue().forEach(studentName -> System.out.println("-- " + studentName));
                    //ascending order / нарастващ ред
                });

    }
}
