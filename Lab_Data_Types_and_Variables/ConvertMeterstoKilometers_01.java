package Lab_Data_Types_and_Variables;

import java.util.Scanner;

public class ConvertMeterstoKilometers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = Integer.parseInt(scanner.nextLine());
        double km = m / 1000.0;
        System.out.printf("%.2f",km);

    }
}
