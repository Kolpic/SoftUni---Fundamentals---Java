package Exercise_Data_Types_and_Variables;

import java.util.Scanner;

public class BeerKegs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double max = 0;
        String maxModel = "";

        for (int i = 0; i < n; i++) {

            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height  = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * Math.pow(radius,2) * height;

            if (volume > max){
                max = volume;
                maxModel = model;
            }
        }
        System.out.println(maxModel);
    }
}