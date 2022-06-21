package Lab_Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> lineOne = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> lineTwo = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> result = new ArrayList<>();

        int minList = Math.min(lineOne.size(), lineTwo.size());
        for (int i = 0; i < minList; i++) {
            int firstNumber = lineOne.get(i);
            int secondNumber = lineTwo.get(i);

            result.add(firstNumber);
            result.add(secondNumber);
        }

        if (lineOne.size() > lineTwo.size()){
            result.addAll(lineOne.subList(minList, lineOne.size()));
        }else{
            result.addAll(lineTwo.subList(minList, lineTwo.size()));
        }
        for(int num : result){
            System.out.print(num + " ");
        }
    }
}
