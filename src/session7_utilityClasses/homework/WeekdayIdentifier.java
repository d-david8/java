package session7_utilityClasses.homework;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/*
 * Description: Construct a method named findDayOfWeek that takes in a date and returns the
 * specific day of the week (e.g., Monday, Tuesday, etc.) for that date.
 * Input: A date in the format YYYY-MM-DD.
 * Expected Output: The day of the week in string format (e.g., "Wednesday").
 * */
public class WeekdayIdentifier {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a date (YYYY-MM-DD): ");
        String stringDate = scanner.nextLine();
        System.out.println(findDayOfWeek(stringDate));

        scanner.close();
    }

    public static String findDayOfWeek(String stringDate) {
        return LocalDate.parse(stringDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"))
                .getDayOfWeek()
                .toString();
    }
}
