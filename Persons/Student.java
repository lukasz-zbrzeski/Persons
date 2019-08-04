package Persons;

public class Student extends Person {
    private String university;

    Student(String firstName, String lastName, String university) {
        super(firstName, lastName);
        this.university = university;
    }

    public String getUniversity() {
        return university;
    }
}
