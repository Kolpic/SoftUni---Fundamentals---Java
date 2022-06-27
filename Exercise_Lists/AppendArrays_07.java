package Exercise_Lists;

import java.util.*;
import java.util.stream.Collectors;

public class AppendArrays_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        List<String> list= Arrays.stream(line.split("\\|")).collect(Collectors.toList());

        Collections.reverse(list);

        System.out.println(list.toString()
                .replace("[","")
                .replace("]","")
                .trim()
                .replaceAll(",","")
                .replaceAll("\\s+"," "));

    }
}
