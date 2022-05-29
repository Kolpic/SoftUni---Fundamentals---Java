package Lab_Data_Types_and_Variables;

import java.util.Scanner;

public class RefactorVolumeofPyramid_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = 0;
        double width = 0;
        double height = 0;

        System.out.print("Length: ");

        length = Double.parseDouble(scanner.nextLine());

        System.out.print("Width: ");

        width = Double.parseDouble(scanner.nextLine());

        System.out.print("Height: ");

        height = Double.parseDouble(scanner.nextLine());

        height = (length * width * height) / 3;

        System.out.printf("Pyramid Volume: %.2f", height);

    }
}
