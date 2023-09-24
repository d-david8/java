package session7_utilityClasses.homework;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/*
 * Description: Write a method named displayCurrentTime that prints the current time to the console.
 * Expected Output: The current time in the format HH:MM:SS.
 * */
public class GettingCurrentTime {

    public static void main(String[] args) {
        displayCurrentTime();

    }

    public static void displayCurrentTime() {
        System.out.println("The current time: " + LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }
}
