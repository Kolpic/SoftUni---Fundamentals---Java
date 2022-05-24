package More_Exercise_Basic_Syntax_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class Messages_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        while (counter != number){
            switch (second){
                case 0:
                    System.out.print(" ");
                    counter++;
                    break;
                case 2:
                    System.out.print("a");
                    counter++;
                    break;
                case 22:
                    System.out.print("b");
                    counter++;
                    break;
                case 222:
                    System.out.print("c");
                    counter++;
                    break;
                case 3:
                    System.out.print("d");
                    counter++;
                    break;
                case 33:
                    System.out.print("e");
                    counter++;
                    break;
                case 333:
                    System.out.print("f");
                    counter++;
                    break;
                case 4:
                    System.out.print("g");
                    counter++;
                    break;
                case 44:
                    System.out.print("h");
                    counter++;
                    break;
                case 444:
                    System.out.print("i");
                    counter++;
                    break;
                case 5:
                    System.out.print("j");
                    counter++;
                    break;
                case 55:
                    System.out.print("k");
                    counter++;
                    break;
                case 555:
                    System.out.print("l");
                    counter++;
                    break;
                case 6:
                    System.out.print("m");
                    counter++;
                    break;
                case 66:
                    System.out.print("n");
                    counter++;
                    break;
                case 666:
                    System.out.print("o");
                    counter++;
                    break;
                case 7:
                    System.out.print("p");
                    counter++;
                    break;
                case 77:
                    System.out.print("q");
                    counter++;
                    break;
                case 777:
                    System.out.print("r");
                    counter++;
                    break;
                case 7777:
                    System.out.print("s");
                    counter++;
                    break;
                case 8:
                    System.out.print("t");
                    counter++;
                    break;
                case 88:
                    System.out.print("u");
                    counter++;
                    break;
                case 888:
                    System.out.print("v");
                    counter++;
                    break;
                case 9:
                    System.out.print("w");
                    counter++;
                    break;
                case 99:
                    System.out.print("x");
                    counter++;
                    break;
                case 999:
                    System.out.print("y");
                    counter++;
                    break;
                case 9999:
                    System.out.print("z");
                    counter++;
                    break;

            }

            if (counter != number) {
                second = Integer.parseInt(scanner.nextLine());
            }
        }
    }
}
