package Exercise_Data_Types_and_Variables;

import java.util.Scanner;

public class SpiceMustFlow_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());
        int yield = startingYield;
        int counter = 0;
        int sum = 0;

        while (true){
            if (yield < 100){
                break;
            }
            startingYield = yield;
            startingYield = startingYield - 26;
            sum += startingYield;
            yield -= 10;
            counter++;
        }
        System.out.println(counter);
        if (sum >= 26){
            sum -= 26;
        }
        System.out.println(sum);
    }
}
