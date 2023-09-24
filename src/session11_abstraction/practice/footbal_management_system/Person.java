package session11_abstraction.practice.footbal_management_system;

import java.time.LocalDate;

public class Person {
    private final String name;
    private final LocalDate dateOfBirth;
    private double salary;

    public Person(String name, LocalDate dateOfBirth, double salary) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Salary: " + salary);
    }
}
