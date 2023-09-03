package session11.practice.footbal_management_system;

import java.time.LocalDate;

class Player extends Person {
    private String position;
    private int goalsScored;

    public Player(String name, LocalDate dateOfBirth, String position, double salary) {
        super(name, dateOfBirth, salary);
        this.position = position;
        this.goalsScored = 0;
    }

    public void updateGoalsScored(int goals) {
        goalsScored += goals;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Position: " + position);
        System.out.println("Goals Scored: " + goalsScored);
    }
}
