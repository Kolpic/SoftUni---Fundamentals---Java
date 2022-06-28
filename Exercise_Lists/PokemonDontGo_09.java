package Exercise_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listIndexes = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int index = Integer.parseInt(scanner.nextLine());

        int sumOfRemovedElements = 0;

        while(!listIndexes.isEmpty()){
            if (index > listIndexes.size()-1){
                index = listIndexes.size() - 1;
            }
            int currentNumber = listIndexes.get(index);
            sumOfRemovedElements += currentNumber;
            listIndexes.remove(index);
            if (listIndexes.isEmpty()){
                break;
            }
            for (int i = 0; i < listIndexes.size(); i++) {

                if (currentNumber >= listIndexes.get(i)){
                    int addedNumber = listIndexes.get(i) + currentNumber;
                    listIndexes.set(i,addedNumber);
                }else if(currentNumber < listIndexes.get(i)){
                    int addedNumber = listIndexes.get(i) - currentNumber;
                    listIndexes.set(i,addedNumber);
                }
            }

            index = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(sumOfRemovedElements);
    }
}
