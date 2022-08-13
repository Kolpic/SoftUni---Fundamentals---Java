package Final_Exam_04_Programming_Fundamentals_Final_Exam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        Pattern pattern = Pattern.compile("@#+(?<barcode>[A-Z][A-Za-z0-9]{4,}[A-Z])@#+");
        for (int i = 0; i < n; i++) {
            String barcode = scanner.nextLine();
            Matcher matcher = pattern.matcher(barcode);
            String group = "";
            if (matcher.find()) {
                group = matcher.group("barcode");
                String productGroup = "";
                for (int j = 0; j < group.length(); j++) {
                    char currentSymbol = group.charAt(j);
                    if (Character.isDigit(currentSymbol)){
                        productGroup += currentSymbol;
                    }
                }
                if (productGroup.equals("")){
                    System.out.println("Product group: 00");
                }else {
                    System.out.println("Product group: " + productGroup);
                }
            }else {
                    System.out.println("Invalid barcode");
                }
            }
        }
    }

