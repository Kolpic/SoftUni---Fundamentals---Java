package Lab_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] inputArr =input.split(" ");

            switch (inputArr[0]) {
                case "Add":
                    numbers.add(Integer.parseInt(inputArr[1]));
                    break;

                case "Remove":
//                    numbers.remove(Integer.parseInt(inputArr[1]));
                    numbers.remove(Integer.valueOf(inputArr[1]));
                    break;

                case "RemoveAt":
//                    numbers.remove(Integer.parseInt(inputArr[1]));
                    numbers.remove(Integer.parseInt(inputArr[1]));
                    break;

                case "Insert":
                    numbers.add(Integer.parseInt(inputArr[2]),Integer.parseInt(inputArr[1]));
                    break;
            }

            input = scanner.nextLine();

        }
        for(int num : numbers){
            System.out.print(num + " ");
        }
    }
}
