package Exercise_Data_Types_and_Variables;

import java.util.Scanner;

public class WaterOverflow_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int tank = 255;
        int result = 0;


        for (int i = 0; i < n; i++) {
            int quantities = Integer.parseInt(scanner.nextLine());
            result += quantities;
            if (result > tank){
                System.out.println("Insufficient capacity!");
                result -= quantities;
            }
        }
        System.out.printf("%d",Math.abs(result));
    }
}
