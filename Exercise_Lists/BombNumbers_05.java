package Exercise_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersToDetonate = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int bombNumber = numbers[0];
        int bombStrength = numbers[1];
        int sum = 0;

        while(numbersToDetonate.contains(bombNumber)){
            int elementIndex = numbersToDetonate.indexOf(bombNumber);

            int left = Math.max(0,elementIndex - bombStrength);
            int right = Math.min(elementIndex + bombStrength,numbersToDetonate.size()-1);

            for (int i = right; i >= left; i--) {
                numbersToDetonate.remove(i);
            }
        }
       for(int num : numbersToDetonate){
           sum += num;
       }
        System.out.println(sum);
    }
}
