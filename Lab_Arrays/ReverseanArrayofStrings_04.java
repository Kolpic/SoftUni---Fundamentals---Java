<<<<<<< HEAD
package Lab_Arrays;

import java.util.Scanner;

public class ReverseanArrayofStrings_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        for (int i = 0; i < input.length / 2; i++) {
            String lastElement = input[i];
            input[i] = input[input.length - 1 - i];
            input[input.length - 1 - i] = lastElement;
        }
        System.out.println(String.join(" ",input));
    }
}
=======
package Lab_Arrays;

import java.util.Scanner;

public class ReverseanArrayofStrings_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        for (int i = 0; i < input.length / 2; i++) {
            String lastElement = input[i];
            input[i] = input[input.length - 1 - i];
            input[input.length - 1 - i] = lastElement;
        }
        System.out.println(String.join(" ",input));
    }
}
>>>>>>> 484dfedb0ae0c8fe3262829940827e7636bd9f13
