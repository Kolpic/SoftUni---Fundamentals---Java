package Exercise_Text_Processing;

import java.util.Scanner;

public class ExtractFile_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputArr = input.split("\\\\");
        String Folder = "";
        String ext = "";
        for (int i = inputArr.length - 1; i > inputArr.length - 2; i--) {
            String[] Folders = inputArr[i].split("\\.");
            Folder = Folders[0];
            ext = Folders[1];
        }
        System.out.printf("File name: %s%n" +
                "File extension: %s%n",Folder,ext);
    }
}
