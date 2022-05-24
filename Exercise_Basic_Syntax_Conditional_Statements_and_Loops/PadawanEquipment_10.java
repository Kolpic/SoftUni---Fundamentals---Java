package Exercise_Basic_Syntax_Conditional_Statements_and_Loops;

import java.util.Scanner;

public class PadawanEquipment_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        double countOfStudents = Integer.parseInt(scanner.nextLine());
        double priceOfLightsabers = Double.parseDouble(scanner.nextLine());
        double priceOfRobes = Double.parseDouble(scanner.nextLine());
        double priceOfBelts = Double.parseDouble(scanner.nextLine());

        double moneyForLightsab = (countOfStudents * priceOfLightsabers) * 0.10;
        double moneyForLightsabers = Math.ceil((countOfStudents * priceOfLightsabers)+ moneyForLightsab);

        double moneyForRobes = countOfStudents * priceOfRobes;

        double countOfFreeBelts =Math.floor(countOfStudents / 6);
        double countOfBelts = countOfStudents - countOfFreeBelts;
        double moneyForBelts =Math.ceil(countOfBelts * priceOfBelts);

        double result = moneyForLightsabers + moneyForRobes + moneyForBelts;
        if (result <= money){
            System.out.printf("The money is enough - it would cost %.2f",result);
        }else {
            System.out.printf("George Lucas will need %.2flv more.",Math.abs(money - result));
        }
    }
}
