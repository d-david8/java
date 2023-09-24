package session7_utilityClasses.homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

/*
 * Description: Develop a method named convertToTimeZone that collects a date and time from the
 * console in the pattern YYYY-MM-DD HH:MM:SS and a timezone (like "EST", "PST").
 * The objective is to transmute the specified date and time to align with the provided timezone
 * and then showcase the result.
 * Input:
 * Date and time structured as YYYY-MM-DD HH:MM:SS.
 * A string indicating the timezone (e.g., "EST").
 * Expected Output: The recalibrated date and time synchronized with the inputted timezone.
 * */
public class TimeConversionAcrossZones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the date and time (YYYY-MM-DD HH:MM:SS): ");
        String dateAndTime = scanner.nextLine();

        System.out.println("Give the time zone (like \"EST\", \"PST\"): ");
        String timeZone = scanner.nextLine().toUpperCase();

        convertToTimeZone(dateAndTime, timeZone);

        scanner.close();
    }

    public static void convertToTimeZone(String inputDateTime, String inputTimeZone) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        try {
            Date newDateTime = format.parse(inputDateTime);
            TimeZone timeZone = TimeZone.getTimeZone(inputTimeZone);
            format.setTimeZone(timeZone);
            System.out.println("The time according with the time zone: " + format.format(newDateTime));

        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("Invalid date or time zone");
        }
    }
}
