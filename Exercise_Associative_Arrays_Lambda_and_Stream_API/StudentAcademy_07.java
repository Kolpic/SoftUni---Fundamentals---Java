package Exercise_Associative_Arrays_Lambda_and_Stream_API;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentAcademy_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String,Double> countOfStudents = new LinkedHashMap<>();

        while (n != 0){
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if(!countOfStudents.containsKey(name)){
                countOfStudents.put(name,grade);
            }else{
                double lastGrade = countOfStudents.get(name);
                double newGrade = (lastGrade + grade) /2;
                countOfStudents.put(name,newGrade);
            }
            n--;
        }
        for (Map.Entry<String, Double> entry : countOfStudents.entrySet()) {
            if (entry.getValue() >= 4.50){
                System.out.printf("%s -> %.2f%n",entry.getKey(),entry.getValue());
            }
        }

    }
}
