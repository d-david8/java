package session9_oopConcepts.homework.college_management_system;

import java.time.LocalDate;

public class Professor {
    private String firstName;
    private String lastName;
    private String sex;
    private String CNP;
    private String address;
    private int age;
    private LocalDate dateOfBirth;

    public Professor(String firstName, String lastName, String sex, String CNP, String address, int age, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.CNP = CNP;
        this.address = address;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
    }

    public Professor() {

    }

    public String getFullName() {
        return this.lastName + " " + this.firstName;
    }
}
