package Exercise_Lists;

import java.util.*;
import java.util.stream.Collectors;

public class ListOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listOfNumbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());


        String command = scanner.nextLine();

        while(!command.equals("End")){
            String[] commandArr = command.split(" ");

            switch (commandArr[0]){

                case "Add":
                    int addNumber = Integer.parseInt(commandArr[1]);
                    listOfNumbers.add(addNumber);
                    break;

                case "Insert":
                    int index = Integer.parseInt(commandArr[2]);
                    int  number = Integer.parseInt(commandArr[1]);

                    if (isValidIndex(index,listOfNumbers.size())){
                        listOfNumbers.add(index,number);
                    }else {
                        System.out.println("Invalid index");
                    }
                    break;

                case "Remove":
                    int indexRemove = Integer.parseInt(commandArr[1]);

                    if (isValidIndex(indexRemove,listOfNumbers.size())){
                        listOfNumbers.remove(indexRemove);
                    }else {
                        System.out.println("Invalid index");
                    }
                    break;

                case "Shift":
                    int distance = Integer.parseInt(commandArr[2]);
                    if (commandArr[1].equals("left")){
                        for (int i = 0; i < distance; i++) {
                            int firstNumber = listOfNumbers.get(0);
                            listOfNumbers.add(firstNumber);
                            listOfNumbers.remove(0);
                        }
                    }else {
                        for (int i = 0; i < distance; i++) {
                            int lastNumber = listOfNumbers.get(listOfNumbers.size()-1);
                            listOfNumbers.add(0,lastNumber);
                            listOfNumbers.remove(listOfNumbers.size()-1);
                        }
                    }
                    break;

            }

            command = scanner.nextLine();
        }
        for(int num:listOfNumbers){
            System.out.print(num + " ");
        }
    }
    public static boolean isValidIndex(int index,int sizeOfList){
        return index >= 0 && index <= sizeOfList - 1;
    }
}
