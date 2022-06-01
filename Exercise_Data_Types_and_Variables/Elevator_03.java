package Exercise_Data_Types_and_Variables;

import java.util.Scanner;

public class Elevator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPeople = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int courses = countPeople / capacity;
        int secondCourses = countPeople % capacity;

        if (courses > 0 && secondCourses > 0){
            System.out.print(courses + 1);
        }else if (courses == 0 && secondCourses > 0){
            System.out.print(1);
        }else if (courses > 0){
            System.out.print(courses);
        }else {
            System.out.print(secondCourses);
        }


    }
}
