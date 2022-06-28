package Exercise_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        List<String> listInput= Arrays.stream(line.split(" ")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while(!command.equals("3:1")){
            String[] commandArr = command.split(" ");
            switch (commandArr[0]){
                case "merge":
                    int startIndex = Integer.parseInt(commandArr[1]);
                    int endIndex = Integer.parseInt(commandArr[2]);

                    if (startIndex < 0){
                        startIndex = 0;
                    }
                    if (endIndex > listInput.size() -1){
                        endIndex = listInput.size() -1;
                    }

                    boolean isValidIndex = startIndex <= listInput.size() -1 && endIndex >= 0 && startIndex < endIndex;

                    if (isValidIndex){
                        String result = "";
                        for (int i = startIndex; i <= endIndex; i++) {
                            String currentText = listInput.get(i);
                            result += currentText;
                        }
                        for (int i = startIndex; i <= endIndex; i++) {
                            listInput.remove(startIndex);
                        }
                        listInput.add(startIndex,result);
                    }
                    break;

                case "divide":
                    int index = Integer.parseInt(commandArr[1]);
                    int parts = Integer.parseInt(commandArr[2]);

                    String elementForDivide = listInput.get(index);
                    listInput.remove(index);

                    int partSize = elementForDivide.length() / parts;
                    int beginIndexOfText = 0;

                    for (int i = 1; i < parts; i++) {
                       listInput.add(index,elementForDivide.substring(beginIndexOfText,beginIndexOfText + partSize));
                       index++;
                        beginIndexOfText += partSize;
                    }
                    listInput.add(index,elementForDivide.substring(beginIndexOfText));
                    break;
            }
            command = scanner.nextLine();
        }
        for (String text : listInput){
            System.out.print(text + " ");
        }
    }
}
