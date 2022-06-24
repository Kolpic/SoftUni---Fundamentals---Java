package Exercise_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersInWagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int maxCapacityInOneWagon = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("end")){
            String[] inputArr = input.split(" ");

            if ("Add".equals(inputArr[0])) {
                numbersInWagons.add(Integer.parseInt(inputArr[1]));
            }else{
                int number = Integer.parseInt(inputArr[0]);
                for (int i = 0; i < numbersInWagons.size(); i++) {

                    int currentWagon = numbersInWagons.get(i);

                    if (number + currentWagon <= maxCapacityInOneWagon){
                        numbersInWagons.set(i,number + numbersInWagons.get(i));
                        break;
                    }
                }
            }

            input = scanner.nextLine();
        }
        for(int nums : numbersInWagons){
            System.out.print(nums + " ");
        }
    }
}
