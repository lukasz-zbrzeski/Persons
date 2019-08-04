package Persons;

public class Worker extends Person {
    private double salary;

    Worker(String firstName, String lastName, double salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "This is Worker"
                + "\nFirst name: " + getFirstName()
                + "\nLast name: " + getLastName()
                + "\nSalary: " + getSalary();
    }


    public double getSalary() {
        return salary;
    }
}
