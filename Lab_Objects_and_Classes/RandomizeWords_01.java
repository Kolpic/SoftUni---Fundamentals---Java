package Lab_Objects_and_Classes;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RandomizeWords_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> stringList =
                Arrays.stream(scanner.nextLine().split(" ")).
                        collect(Collectors.toList());

        Random rd = new Random();
        while (!stringList.isEmpty()){
            int currentNum = rd.nextInt(stringList.size());
            String currentName = stringList.get(currentNum);
            System.out.println(currentName);
            stringList.remove(currentName);
        }
    }
}
