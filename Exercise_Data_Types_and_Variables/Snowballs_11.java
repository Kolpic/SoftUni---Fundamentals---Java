package Exercise_Data_Types_and_Variables;

import java.util.Scanner;

public class Snowballs_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int max = 0;
        int maxSnowballSnow = 0;
        int maxSnowballTime = 0;
        int maxSnowballQuality = 0;

        for (int i = 0; i < n; i++) {

            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            int res = snowballSnow/snowballTime;

            int snowballValue = (int) Math.pow(res,snowballQuality);
            if (snowballValue > max){
                max = snowballValue;
                maxSnowballSnow = snowballSnow;
                maxSnowballTime = snowballTime;
                maxSnowballQuality = snowballQuality;
            }
            if (i == n - 1){
                System.out.printf("%d : %d = %d (%d)",maxSnowballSnow,maxSnowballTime,max,maxSnowballQuality);
            }

        }

    }
}
