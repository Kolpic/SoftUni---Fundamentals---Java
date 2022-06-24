package Exercise_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersInWagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while(!command.equals("end")){
            String[] commandArr = command.split(" ");

            switch (commandArr[0]){
                case "Delete":
                    int commandArrInt =Integer.parseInt(commandArr[1]);
                    for (int i = 0; i < numbersInWagons.size(); i++) {
                        numbersInWagons.remove(Integer.valueOf(commandArrInt));
                    }
                    break;

                case "Insert":
                    int index = Integer.parseInt(commandArr[2]);
                    int number = Integer.parseInt(commandArr[1]);
                    numbersInWagons.add(index,number);
                    break;
            }

            command = scanner.nextLine();
        }
        for(int num : numbersInWagons){
            System.out.print(num + " ");
        }

    }
}
