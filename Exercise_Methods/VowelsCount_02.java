package Exercises_Methods;

import java.util.Scanner;

public class VowelsCount_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        printVowels(input);
    }

    private static void printVowels(String input){
        int counterA = 0;
        int counterO = 0;
        int counterU = 0;
        int counterE = 0;
        int counterI = 0;
        String[] arr =  input.split("");
        for (int i = 0; i < arr.length; i++) {
            if ("a".equals(arr[i])) {
                counterA++;
            } else if ("A".equals(arr[i])) {
                counterA++;
            } else if ("o".equals(arr[i])) {
                counterO++;
            }else if ("O".equals(arr[i])) {
                counterO++;
            } else if ("u".equals(arr[i])) {
                counterU++;
            }else if ("U".equals(arr[i])) {
                counterU++;
            }else if ("e".equals(arr[i])) {
                counterE++;
            } else if ("E".equals(arr[i])) {
                counterE++;
            }else if ("i".equals(arr[i])) {
                counterI++;
            } else if ("I".equals(arr[i])) {
                counterI++;
            }
        }

        System.out.println(counterA + counterO + counterU + counterE + counterI);
    }
}
