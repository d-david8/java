package session7.homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * Description: Write a method named areDatesEqual that reads two dates from the console and returns
 * true if they are equal, and false otherwise.
 * Input: Two dates entered by the user in the format YYYY-MM-DD.
 * Expected Output:
 * true if both dates are equal.
 * false if they are different.
 * */
public class ComparingUserEnteredDates {

    public static void main(String[] args) {
        System.out.println(areDatesEqual());
    }

    public static boolean areDatesEqual() {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        System.out.print("Give the first date (YYYY-MM-DD): ");
        String stringDate1 = scanner.nextLine();

        System.out.print("Give the second date (YYYY-MM-DD): ");
        String stringDate2 = scanner.nextLine();

        scanner.close();
        try {
            Date date1 = format.parse(stringDate1);
            Date date2 = format.parse(stringDate2);
            return date1.equals(date2);
        } catch (ParseException e) {
            System.out.println("The format of the date is invalid!");
            return false;
        }
    }
}
