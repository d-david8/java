Event Scheduler and Reminder
Description:
The Event Planner Corporation has hired you to create a Java application that manages event schedules 
and reminders. Clients of the Event Planner have busy schedules and need an automated system to help 
them organize their events and notify them of upcoming events.

For this task, you're required to:
Design classes that will help model and manage events.
Use LocalDate and LocalDateTime for scheduling and timing purposes.

Specifications:

Event Class
Attributes:
eventName: A string containing the name of the event.
eventDescription: A brief description of the event.
eventDateTime: A LocalDateTime object that represents when the event will take place.
reminderDateTime: A LocalDateTime object that indicates when the user should be reminded of the event.
Methods:
Constructors, getters, setters, etc.
timeUntilEvent(): Returns the time remaining until the event.
timeUntilReminder(): Returns the time left until the reminder should notify the user.

Scheduler Class
Attributes:
events: A list containing multiple events.
Methods:
addEvent(Event e): Adds an event to the list.
removeEvent(String eventName): Removes an event by its name.
getUpcomingEvents(int n): Returns the next n upcoming events.
getEventsOn(LocalDate date): Returns all events scheduled for a specific date.
getPendingReminders(): Returns all reminders that are due to notify the user soon (e.g., in the next 24 hours).

