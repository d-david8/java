package session7.homework;

import java.time.LocalDate;
import java.util.Scanner;

/*
 * Description: Write a method named addWeeksToToday that accepts an integer as its argument.
 * This integer denotes the number of weeks. The method should add this number of weeks to today's date
 * and return the resultant date.
 * Input: An integer n (e.g., 4).
 * Expected Output: A date object that is n weeks from today.
 *
 * */
public class DateArithmetic {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give the number of the weeks: ");
        int weeksToAdd = scanner.nextInt();

        System.out.println("Current date: " + LocalDate.now());
        System.out.println(weeksToAdd + " weeks in the future " + addWeeksToToday(weeksToAdd));
    }

    public static LocalDate addWeeksToToday(int weeksToAdd) {
        return LocalDate.now().plusWeeks(weeksToAdd);
    }
}
