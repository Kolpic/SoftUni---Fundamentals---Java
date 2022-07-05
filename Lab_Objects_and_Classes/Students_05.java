package Lab_Objects_and_Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students_05 {

    static class Student {
        String firstName;
        String lastName;
        String age;
        String homeTown;

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getAge() {
            return this.age;
        }

        public void setHomeTown(String homeTown) {
            this.homeTown = homeTown;
        }

        public String getHomeTown() {
            return this.homeTown;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        List<Student> studentsList = new ArrayList<>();

        while(!command.equals("end")){
            String[] commandArr = command.split(" ");

            Student student = new Student();
            student.setFirstName(commandArr[0]);
            student.setLastName(commandArr[1]);
            student.setAge(commandArr[2]);
            student.setHomeTown(commandArr[3]);

            studentsList.add(student);

            command = scanner.nextLine();
        }
        String cityName = scanner.nextLine();
        for (Student town : studentsList)
        if (cityName.equals(town.getHomeTown())){
            System.out.printf("%s %s is %s years old%n",
                    town.getFirstName(),
                    town.getLastName(),
                    town.getAge());
        }
    }
}
