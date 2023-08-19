package session7.homework.event_scheduler;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Event {

    private String eventName;
    private String eventDescription;
    private LocalDateTime eventDateTime;
    private LocalDateTime reminderDateTime;

    public Event(String eventName, String eventDescription, LocalDateTime eventDateTime, LocalDateTime reminderDateTime) {
        this.eventName = eventName;
        this.eventDescription = eventDescription;
        this.eventDateTime = eventDateTime;
        this.reminderDateTime = reminderDateTime;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public LocalDateTime getEventDateTime() {
        return eventDateTime;
    }

    public void setEventDateTime(LocalDateTime eventDateTime) {
        this.eventDateTime = eventDateTime;
    }

    public LocalDateTime getReminderDateTime() {
        return reminderDateTime;
    }

    public void setReminderDateTime(LocalDateTime reminderDateTime) {
        this.reminderDateTime = reminderDateTime;
    }

    public Duration timeUntilEvent() {
        return Duration.between(LocalDateTime.now(), this.eventDateTime);
    }

    public Duration timeUntilReminder() {
        return Duration.between(this.reminderDateTime, LocalDateTime.now());
    }

    public String toStringReminder() {
        return "You have a reminder for " +
                eventName +
                " on " +
                reminderDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd h:m a"));
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd h:m a");
        return "\n" + eventName + " (" +
                eventDescription + ") on" +
                eventDateTime.format(formatter) + " reminder " +
                reminderDateTime.format(formatter);
    }

    public int compareTo(Event e) {
        return this.eventDateTime.compareTo(e.eventDateTime);
    }
}
