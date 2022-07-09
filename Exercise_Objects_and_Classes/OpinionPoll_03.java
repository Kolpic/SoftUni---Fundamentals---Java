package Exercise_Objects_and_Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OpinionPoll_03 {

    static class Person{
        String name;
        int age;

        public Person(String name, int age){
            this.name = name;
            this.age = age;
        }
        @Override
        public String toString(){
            return this.name + " - " + this.age;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Person> personList = new ArrayList<>();

        while(n != 0){
            String[] personArr = scanner.nextLine().split(" ");
            String personName = personArr[0];
            int personAge = Integer.parseInt(personArr[1]);

            if (personAge > 30){
                Person currentPerson = new Person(personName,personAge);
                personList.add(currentPerson);
            }

            n--;
        }
        for(Person name : personList){
            System.out.println(name);
        }
    }
}
