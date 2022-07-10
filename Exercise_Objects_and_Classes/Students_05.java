package Exercise_Objects_and_Classes;

import java.util.*;

public class Students_05 {
    static class Student{
        String firstName;
        String lastName;
        double grade;

        public Student(String firstName, String lastName,double grade){
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public double getGrade() {
            return this.grade;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Student> listOfStudents = new ArrayList<>();

        double minDouble = 0.00;
        double middleDouble = 0.00;
        int counter = 1;

        while(n != 0){
            String[] commandArr = scanner.nextLine().split(" ");
            String firstName = commandArr[0];
            String lastName = commandArr[1];
            double grade = Double.parseDouble(commandArr[2]);

            Student currentStudent = new Student(firstName,lastName,grade);

            listOfStudents.add(currentStudent);

            n--;
        }
        listOfStudents.sort(Comparator.comparingDouble(Student :: getGrade).reversed());

        for(Student stats : listOfStudents){
            System.out.printf("%s %s: %.2f%n",stats.getFirstName(),
                    stats.getLastName(),
                    stats.getGrade());
        }
    }
}
