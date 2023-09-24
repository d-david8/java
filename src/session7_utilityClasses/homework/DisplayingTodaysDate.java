package session7_utilityClasses.homework;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
 * Description: Write a method named displayTodaysDate that, when called, prints the current date to the console.
 * Expected Output: Today's date in the format YYYY-MM-DD.
 * */
public class DisplayingTodaysDate {

    public static void main(String[] args) {
        displayTodaysDate();
    }

    public static void displayTodaysDate() {
        LocalDateTime currentDate = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formatedDate = currentDate.format(formatter);
        System.out.println(formatedDate);
    }
}
