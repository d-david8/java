package session7.homework;

import java.time.LocalDate;

/*
 * Description: Write a method named displayDateComponents that accepts a date as an argument
 * and prints its year, month, and day components separately.
 *
 * Input: A date in the format YYYY-MM-DD.
 * Expected Output:
 * Year: YYYY
 * Month: MM
 * Day: DD
 * */
public class DateDecomposition {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        displayDateComponents(localDate);
    }

    public static void displayDateComponents(LocalDate inputDate) {
        String year = String.valueOf(inputDate.getYear());

        int monthInt = inputDate.getMonthValue();
        String month = monthInt < 10 ? "0" + monthInt : String.valueOf(monthInt);

        int dayInt = inputDate.getDayOfMonth();
        String day = dayInt < 10 ? "0" + dayInt : String.valueOf(dayInt);

        System.out.printf("Year: %s%nMonth: %s%nDay: %s", year, month, day);
    }
}
