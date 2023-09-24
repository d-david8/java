package session9_oopConcepts.homework.fitness_tracking_system;

public class WeeklyGoal {
    private String activityType;
    private double targetValue;

    public WeeklyGoal(String activityType, double targetValue) {
        this.activityType = activityType;
        this.targetValue = targetValue;
    }

    public String getActivityType() {
        return this.activityType;
    }

    public boolean isGoalMet(double totalValue) {
        return totalValue >= targetValue;
    }

    public double getTargetValue() {
        return this.targetValue;
    }
}
