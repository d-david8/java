package session7_utilityClasses.homework.event_scheduler;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class EventSchedulerAndReminder {

    public static void main(String[] args) {
        Scheduler scheduler = new Scheduler();
        populateTheScheduler(scheduler);

        displayAllEvents(scheduler);

        scheduler.removeEvent("Event 3");
        displayAllEvents(scheduler);


        System.out.println("----------- Display the 3 incoming events -------");
        System.out.println(scheduler.getUpcomingEvents(3));
        System.out.println();

        System.out.println("----------- Display the events on 2023-09-20------");
        System.out.println(scheduler.getEventsOn(LocalDate.of(2023, 9, 20)));
        System.out.println();

        displayTheNextRemainder(scheduler);
    }

    public static void displayTheNextRemainder(Scheduler scheduler) {
        System.out.println(scheduler.getUpcomingEvents(1).get(0).toStringReminder());
    }

    public static void displayAllEvents(Scheduler scheduler) {
        System.out.println("----------- All the events ------------");
        System.out.println(scheduler);
        System.out.println();
    }

    private static void populateTheScheduler(Scheduler scheduler) {
        Event event1 = new Event(
                "Event 1",
                "Description 1",
                LocalDateTime.of(2023, 8, 25, 10, 30),
                LocalDateTime.of(2023, 8, 24, 10, 30));
        scheduler.addEvent(event1);

        Event event2 = new Event(
                "Event 2",
                "Description 2",
                LocalDateTime.of(2023, 8, 26, 11, 30),
                LocalDateTime.of(2023, 8, 25, 11, 30));
        scheduler.addEvent(event2);

        Event event3 = new Event(
                "Event 3",
                "Description 3",
                LocalDateTime.of(2023, 8, 20, 10, 30),
                LocalDateTime.of(2023, 8, 19, 10, 30));
        scheduler.addEvent(event3);

        Event event4 = new Event(
                "Event 4",
                "Description 4",
                LocalDateTime.of(2023, 6, 20, 10, 30),
                LocalDateTime.of(2023, 6, 19, 10, 30));
        scheduler.addEvent(event4);

        Event event5 = new Event(
                "Event 5",
                "Description 5",
                LocalDateTime.of(2023, 9, 20, 10, 30),
                LocalDateTime.of(2023, 9, 19, 10, 30));
        scheduler.addEvent(event5);

        Event event6 = new Event(
                "Event 6",
                "Description 6",
                LocalDateTime.of(2023, 9, 20, 12, 30),
                LocalDateTime.of(2023, 9, 19, 12, 30));
        scheduler.addEvent(event6);
    }
}
