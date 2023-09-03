package session11.practice.footbal_management_system;

import java.time.LocalDate;

class Coach extends Person {
    private int yearsOfExperience;

    public Coach(String name, LocalDate dateOfBirth, int yearsOfExperience, double salary) {
        super(name, dateOfBirth, salary);
        this.yearsOfExperience = yearsOfExperience;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Years of Experience: " + yearsOfExperience + " years");
    }
}
