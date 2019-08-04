package Persons;

public class Worker extends Person {
    private double salary;

    Worker(String firstName, String lastName, double salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
