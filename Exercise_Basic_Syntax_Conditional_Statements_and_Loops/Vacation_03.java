package Exercise_Basic_Syntax_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int students = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0;

        if (day.equals("Friday")){
            if (type.equals("Students")){
                price = 8.45;
            }else if (type.equals("Business")){
                price = 10.90;
            }else if (type.equals("Regular")){
                price = 15;
            }

        }else if (day.equals("Saturday")){
            if (type.equals("Students")){
                price = 9.80;
            }else if (type.equals("Business")){
                price = 15.60;
            }else if (type.equals("Regular")){
                price = 20;
            }

        }else if (day.equals("Sunday")){
            if (type.equals("Students")){
                price = 10.46;
            }else if (type.equals("Business")){
                price = 16;
            }else if (type.equals("Regular")){
                price = 22.50;
            }
        }
        double finalprice = price * students;
        double ots;
        if (type.equals("Students") && students >=30){
            ots = finalprice * 0.15;
            finalprice = finalprice - ots;
        }else if (type.equals("Business") && students >=100){
            students = students - 10;
            finalprice = price * students;
            ots = finalprice * 0.15;
            finalprice = finalprice - ots;
        }else if (type.equals("Regular") && students >=10 && students <=20){
            ots = finalprice * 0.05;
            finalprice = finalprice - ots;
        }
        System.out.printf("Total price: %.2f",finalprice);
    }
}
