package session9_oopConcepts.homework.fitness_tracking_system;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<Workout> workoutList;
    private List<WeeklyGoal> weeklyGoals;

    public User(String name) {
        this.name = name;
        this.workoutList = new ArrayList<>();
        this.weeklyGoals = new ArrayList<>();
    }

    public void logWorkout(Workout workout) {
        workoutList.add(workout);
    }

    public void setWeeklyGoal(WeeklyGoal goal) {
        weeklyGoals.add(goal);
    }

    public void generateWeeklySummary() {
        System.out.println("Weekly summary for " + name);
        for (WeeklyGoal goal : weeklyGoals) {
            double totalValue = 0;
            for (Workout workout : workoutList) {
                if (workout.getType().equals(goal.getActivityType())) {
                    totalValue += workout.getWorkoutValue(goal.getActivityType());
                    System.out.println("Date: " + workout.getDate() + " Activity: " + goal.getActivityType() +
                            ", Value: " + workout.getWorkoutValue(goal.getActivityType()));
                }
            }
            System.out.println("Total " + goal.getActivityType() + " " + totalValue);
            System.out.println("Goal  " + goal.getActivityType() + " " + goal.getTargetValue());
            System.out.println("Goal met: " + (goal.isGoalMet(totalValue) ? "Yes" : "No"));
        }
    }

}
