package session7_utilityClasses.homework;

import java.time.LocalDate;

/*
 * Description: Write a method named isTodaySpecificDate that checks if today's date is 10th December 2019.
 * Expected Output:
 * true if today's date is 2019-12-10.
 * false otherwise.

 * */
public class IsTodayASpecificDate {

    public static void main(String[] args) {
        System.out.println(isTodaySpecificDate());
    }

    public static boolean isTodaySpecificDate() {
        LocalDate specificDate = LocalDate.of(2019, 12, 10);
        LocalDate localDate = LocalDate.now();
        return localDate.equals(specificDate);
    }
}
