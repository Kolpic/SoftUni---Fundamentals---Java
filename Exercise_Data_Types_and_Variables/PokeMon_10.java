package Exercise_Data_Types_and_Variables;

import java.util.Scanner;

public class PokeMon_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePower = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());
        double halfPokePower = pokePower * 0.5;

        int counter = 0;

        while (true){
            if (pokePower < distance){
                break;
            }
            pokePower -= distance;
           counter ++;
           if (pokePower == halfPokePower){
               pokePower = pokePower / exhaustionFactor;
           }
        }
        System.out.println(pokePower);
        System.out.println(counter);
    }
}
