package Persons;

public class Student extends Person {
    private String university;

    Student(String firstName, String lastName, String university) {
        super(firstName, lastName);
        this.university = university;
    }

    @Override
    public String toString() {
        return "This is Student"
                + "\nFirst name: " + getFirstName()
                + "\nLast name: " + getLastName()
                + "\nUniversity: " + getUniversity();
    }

    public String getUniversity() {
        return university;
    }
}
