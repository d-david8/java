package session7_utilityClasses.homework;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/*
 * Description: Design a method titled daysBetween that reads two dates from the console and
 * computes the total number of days between them.
 * Input: Two dates given by the user in the format YYYY-MM-DD.
 * Expected Output: An integer showcasing the difference in days between the two dates.

 * */
public class IntervalBetweenDates {

    public static void main(String[] args) {
        daysBetween();
    }

    private static void daysBetween() {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.print("Give the first date (YYYY-MM-DD): ");
        String stringDate1 = scanner.nextLine();

        System.out.print("Give the second date (YYYY-MM-DD): ");
        String stringDate2 = scanner.nextLine();

        LocalDateTime date1 = LocalDateTime.of(LocalDate.parse(stringDate1, formatter), LocalTime.of(0, 0, 0));
        LocalDateTime date2 = LocalDateTime.of(LocalDate.parse(stringDate2, formatter), LocalTime.of(0, 0, 0));

        long difference = Math.abs(Duration.between(date1, date2).toDays());

        System.out.println("Between " + stringDate1 + " and " + stringDate2 + " is a difference of " + difference + " days.");

        scanner.close();
    }

}
