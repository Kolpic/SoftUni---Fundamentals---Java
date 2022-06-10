package Exercise_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersLineOne = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean isTop = false;

        for (int index = 0; index <= numbersLineOne.length -1; index++) {

            int currentNumber = numbersLineOne[index];
            if (index == numbersLineOne.length -1){
                System.out.println(currentNumber + " ");
                continue;
            }

            for (int right = index + 1; right <= numbersLineOne.length -1; right++) {
                if (currentNumber > numbersLineOne[right]){
                    isTop = true;
                }else {
                    isTop = false;
                    break;
                }
            }
            if (isTop){
                System.out.print(currentNumber + " ");
            }
        }

    }
}

