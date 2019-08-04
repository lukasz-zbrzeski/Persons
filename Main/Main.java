package Main;

import Persons.*;

public class Main {
    public static void main(String[] args) {
        Person[] person = new Person[2];

        person[0] = new Worker("Łukasz", "Zbrzeski", 5000);
        person[1] = new Student("Łukasz", "Zbrzeski", "Example");

        for (Person persons : person) {
            if (persons instanceof Person) {
                System.out.println(persons.toString() + "\n");
            }
        }
    }
}
