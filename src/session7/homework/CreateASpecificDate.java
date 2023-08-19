package session7.homework;

import java.time.LocalDate;
import java.time.Month;

/*
 * Description: Write a method named createSpecificDate that returns a date object representing 19th August 2025.
 * Expected Output: A date object for 2025-8-19.
 * */
public class CreateASpecificDate {

    public static void main(String[] args) {
        System.out.println(createSpecificDate("19th August 2025"));
    }

    public static LocalDate createSpecificDate(String input) {
        String[] dateSplit = input.split(" ");
        int day = Integer.parseInt(dateSplit[0].replaceAll("[^0-9]", ""));
        int year = Integer.parseInt(dateSplit[2]);
        String month = dateSplit[1].toUpperCase();

        return LocalDate.of(year, Month.valueOf(month), day);
    }
}
