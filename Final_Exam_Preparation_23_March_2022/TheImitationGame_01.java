package Final_Exam_Preparation_23_March_2022;

import java.util.Scanner;

public class TheImitationGame_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String encryptedMessage = scanner.nextLine();

        String command  = scanner.nextLine();

        while(!command.equals("Decode")){
            switch (command.split("\\|")[0]){
                case "Move":
                    int numberOfLetters =Integer.parseInt(command.split("\\|")[1]);
                    String lettersToBeRemoved =  encryptedMessage.substring(0, numberOfLetters);
                    StringBuilder builder = new StringBuilder(encryptedMessage);
                    builder.delete(0,numberOfLetters);
                    encryptedMessage =  builder.append(lettersToBeRemoved).toString();
                    break;

                case "Insert":
                    int index = Integer.parseInt(command.split("\\|")[1]);
                    String value = command.split("\\|")[2];
                    StringBuilder builder1 = new StringBuilder(encryptedMessage);
                    builder1.insert(index,value);
                    encryptedMessage = builder1.toString();
                    break;

                case "ChangeAll":
                    String substring = command.split("\\|")[1];
                    String replacement = command.split("\\|")[2];
                    String result = encryptedMessage.replace(substring,replacement);
                    encryptedMessage = result;
                    break;
            }


            command = scanner.nextLine();
        }
        System.out.printf("The decrypted message is: %s",encryptedMessage);
    }
}
