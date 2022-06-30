package Mid_Exam_Preparation_20_June_2022;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targets = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while(!command.equals("End")){
            String [] commandArr = command.split(" ");
            String activity = commandArr[0];
            int index =Integer.parseInt(commandArr[1]);
            int value = Integer.parseInt(commandArr[2]);

            switch (activity){
                case "Shoot":
                    if (isValidIndex(targets,index)){
                        int valueOfList = targets.get(index);
                        int resultAfterShooting = valueOfList - value;

                        if (resultAfterShooting <= 0){
                            targets.remove(index);
                        }else{
                            targets.set(index,resultAfterShooting);
                        }
                    }
                    break;

                case "Add":
                    if (isValidIndex(targets,index)){
                        targets.add(index,value);
                    }else{
                        System.out.println("Invalid placement!");
                    }
                    break;

                case "Strike":
                    int radius = value * value + 1;
                    if (isValidIndex(targets,index)){
                        if (radius >= 0 && radius <= targets.size() -1
                            && index + value <= targets.size() -1
                            && index - value >= 0 && index - value < index + value){

                            for (int i = index + value; i >= index - value; i--) {
                                targets.remove(i);
                            }
                        }else{
                            System.out.println("Strike missed!" );
                        }
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        boolean flag = false;

        for(int num : targets){
            if (num == targets.get(targets.size()-1)){
                System.out.print(num);
                flag = true;
            }
            if(!flag) {
                System.out.print(num + "|");
            }
        }
    }

    public static boolean isValidIndex(List<Integer> targets, int index){
       return index >= 0 && index <= targets.size() - 1;
    }
}
