package Final_Exam_04_Programming_Fundamentals_Final_Exam;

import java.util.Scanner;

public class PasswordReset_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        String command = scanner.nextLine();
        while(!command.equals("Done")){
            switch (command.split("\\s+")[0]){
                case"TakeOdd":
                    StringBuilder builder = new StringBuilder();
                    for (int i = 1; i < password.length(); i += 2) {
                        char currentChar = password.charAt(i);
                        builder.append(currentChar);
                    }
                    password = builder.toString();
                    System.out.println(password);
                    break;

                case"Cut":
                    int index = Integer.parseInt(command.split("\\s+")[1]);
                    int length = Integer.parseInt(command.split("\\s+")[2]);
                    StringBuilder cutter = new StringBuilder(password);
                    password =  cutter.replace(index,length + index,"").toString();

                    System.out.println(password);
                    break;

                case"Substitute":
                    String substring = command.split("\\s+")[1];
                    String substitute = command.split("\\s+")[2];

                    if (password.contains(substring)){
                       password =  password.replace(substring,substitute);
                        System.out.println(password);
                    }else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }

            command = scanner.nextLine();
        }
        System.out.printf("Your password is: %s",password);
    }
}
