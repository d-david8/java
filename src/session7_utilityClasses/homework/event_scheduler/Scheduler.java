package session7_utilityClasses.homework.event_scheduler;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Scheduler {
    private final List<Event> events;

    public Scheduler() {
        events = new ArrayList<>();
    }

    public void addEvent(Event e) {
        events.add(e);
        events.sort(Event::compareTo);
    }

    public void removeEvent(String eventName) {
        events.removeIf(current -> current.getEventName().equals(eventName));
    }

    public List<Event> getUpcomingEvents(int n) {
        List<Event> upcomingEvents = new ArrayList<>();
        LocalDateTime now = LocalDateTime.now();

        for (Event event : events) {
            if (event.getEventDateTime().isAfter(now)) {
                upcomingEvents.add(event);
                if (upcomingEvents.size() == n) {
                    break;
                }
            }
        }
        return upcomingEvents;
    }

    public List<Event> getEventsOn(LocalDate date) {
        List<Event> eventsOn = new ArrayList<>();
        for (Event event : events) {
            if (date.equals(event.getEventDateTime().toLocalDate())) eventsOn.add(event);
        }
        return eventsOn;
    }

    public List<Event> getPendingReminders(int nextPeriod) {
        List<Event> pendingReminders = new ArrayList<>();
        LocalDateTime now = LocalDateTime.now();

        for (Event event : events) {
            if (Duration.between(now, event.getReminderDateTime()).toHours() <= nextPeriod) {
                pendingReminders.add(event);
            }
        }
        return pendingReminders;
    }

    @Override
    public String toString() {
        return "Scheduler:" + events;
    }
}
