package Lab_Methods;

import java.util.Scanner;

public class GreaterofTwoValues_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();

        switch (type){
            case "int":
                int numberOne = Integer.parseInt(scanner.nextLine());
                int numberTwo = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(numberOne,numberTwo));
                break;

            case "char":
                char one = scanner.nextLine().charAt(0);
                char two = scanner.nextLine().charAt(0);
                System.out.println(getMax(one,two));
                break;

            case "string":
                String first = scanner.nextLine();
                String second = scanner.nextLine();
                System.out.println(getMax(first,second));
                break;

        }
    }

    public static int getMax(int one,int two){
        int result = 0;
        if (one > two){
            result = one;
        }else {
            result = two;
        }
        return result;
    }

    public static char getMax(char one,char two){
        int result = 0;
        if (one > two){
            result = one;
        }else {
            result = two;
        }
        return (char) result;
    }

    public static String getMax(String one,String two){
        String result = "";
        if (one.compareTo(two) > 0){
            result = one;
        }else {
            result = two;
        }
        return result;
    }
}
