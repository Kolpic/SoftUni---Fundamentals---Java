package Lab_Associative_Arrays_Lambda_and_Stream_API;

import java.util.*;
import java.util.stream.Collectors;

public class Count_Real_Numbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbersList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());


        Map<Double,Integer> numbersMap = new TreeMap<>();

        for(double num : numbersList){
            Integer currentValue = numbersMap.get(num);
            if(numbersMap.containsKey(num)){
                numbersMap.put(num,currentValue + 1);
            }else{
                numbersMap.put(num,1);
            }
        }
        for (Map.Entry<Double, Integer> doubleIntegerEntry : numbersMap.entrySet()) {
            System.out.printf("%.0f -> %d%n",doubleIntegerEntry.getKey(),doubleIntegerEntry.getValue());
        }

    }
}
