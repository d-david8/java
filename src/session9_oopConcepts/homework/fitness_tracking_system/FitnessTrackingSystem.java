package session9_oopConcepts.homework.fitness_tracking_system;

import java.time.LocalDate;

public class FitnessTrackingSystem {
    public static void main(String[] args) {
        User user = new User("david");

        user.setWeeklyGoal(new WeeklyGoal("Running", 20.0));
        user.setWeeklyGoal(new WeeklyGoal("Weightlifting", 10.0));

        user.logWorkout(new Workout("Running", 30.0, 115.0, 0, LocalDate.parse("2023-01-01")));
        user.logWorkout(new Workout("Weightlifting", 0, 0, 5.0, LocalDate.parse("2023-01-01")));
        user.logWorkout(new Workout("Running", 10.0, 100, 0, LocalDate.parse("2023-01-02")));

        user.generateWeeklySummary();
    }
}

