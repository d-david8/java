package session9.homework.college_management_system;

import java.time.Duration;

//track details like its schedule, duration, description, and the assigned professor.
public class Course {
    private String name;
    private String description;
    private String schedule;
    private Duration duration;
    private Professor assignedProfessor;

    public Course(String name, String description, String schedule, Duration duration, Professor assignedProfessor) {
        this.name = name;
        this.description = description;
        this.schedule = schedule;
        this.duration = duration;
        this.assignedProfessor = assignedProfessor;
    }

    public Course() {
    }

    public void setProfessor(Professor professor) {
        this.assignedProfessor = professor;
    }

    @Override
    public String toString() {
        return "Cours name: " + name + ", description: " + description +
                ", schedule: " + schedule +
                ", duration: " + duration.toString() +
                ", assignedProfessor: " + assignedProfessor.getFullName();
    }
}
