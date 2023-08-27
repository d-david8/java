package session9.homework.fitness_tracking_system;

import session5.practice.SwitchStatements;

import java.time.LocalDate;

public class Workout {
    private String type;
    private double duration;
    private double distance;
    private double weight;
    private LocalDate date;

    public Workout(String type, double duration, double distance, double weight, LocalDate date) {
        this.type = type;
        this.duration = duration;
        this.distance = distance;
        this.weight = weight;
        this.date = date;
    }

    public String getType() {
        return this.type;
    }

    public double getDistance() {
        return this.distance;
    }

    public double getWeight() {
        return weight;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public double getDuration() {
        return this.duration;
    }

    public double getWorkoutValue(String type) {
        return switch (type) {
            case "Running" -> distance;
            case "Weightlifting" -> weight;
            case "Yoga" -> duration;
            default -> 0.0;
        };
    }
}
