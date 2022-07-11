package Exercise_Objects_and_Classes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class OrderbyAge_07 {
    static class Person {
        String name;
        String ID;
        int age;

        public Person(String name, String ID, int age) {
            this.name = name;
            this.ID = ID;
            this.age = age;
        }

        public int getAge() {
            return this.age;
        }

        @Override
        public String toString() {
            return this.name + " with ID: " + this.ID + " is " + this.age + " years old.";
        }
    }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            List<Person> listOfPersons = new ArrayList<>();

            String unknown = scanner.nextLine();

            while (!unknown.equals("End")) {
                String[] unknownArr = unknown.split(" ");
                String name = unknownArr[0];
                String ID = unknownArr[1];
                int age = Integer.parseInt(unknownArr[2]);

                Person currentPerson = new Person(name, ID, age);
                listOfPersons.add(currentPerson);

                unknown = scanner.nextLine();
            }
            listOfPersons.sort(Comparator.comparingDouble(Person::getAge));
            for (Person info : listOfPersons) {
                System.out.println(info);
            }
        }
    }

