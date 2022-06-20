package Lab_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        // 1 2 3 4 5 -----> 6 6 3

        for (int i = 0; i <= numbers.size() / 2; i++) {
            int firstElement = numbers.get(i);
            int secondElement = numbers.get(numbers.size()- 1);

            numbers.set(i, firstElement + secondElement);
            numbers.remove(numbers.size() -1);
        }

        for (int number : numbers){
            System.out.print(number + " ");
        }
    }
}
