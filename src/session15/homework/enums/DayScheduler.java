package session15.homework.enums;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;

/*
 * Create a day scheduler application that uses an enum to represent the days of the week.
 * The application should be able to assign and retrieve activities for each day.
 * */
public class DayScheduler {
    enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    private final EnumMap<Day, List<String>> activities;

    public DayScheduler() {
        activities = new EnumMap<>(Day.class);
        for (Day day : Day.values()) {
            activities.put(day, new ArrayList<>());
        }
    }

    public void addActivity(Day day, String activity) {
        activities.get(day).add(activity);

    }

    public String getActivities(Day day) {
        return activities.get(day).toString();
    }

    public static void main(String[] args) {
        DayScheduler scheduler = new DayScheduler();

        scheduler.addActivity(Day.MONDAY, "Work on project");
        scheduler.addActivity(Day.MONDAY, "Meeting");
        scheduler.addActivity(Day.WEDNESDAY, "Go to the gym");
        scheduler.addActivity(Day.WEDNESDAY, "Grocery shopping");
        scheduler.addActivity(Day.FRIDAY, "Read a book");

        for (Day day : Day.values()) {
            System.out.println(day + " Activities: " + scheduler.getActivities(day));
        }
    }
}
