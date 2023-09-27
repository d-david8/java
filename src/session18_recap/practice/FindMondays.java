package session18_recap.practice;

import java.time.LocalDate;

/*
 * Problem 2 Using Java's built-in date/time libraries, generate a list of all Mondays in the upcoming year.
 * Print out each Monday's date.
 * */
public class FindMondays {

    public static void main(String[] args) {
        LocalDate nextMonday = findNextMonday();
        LocalDate temp = findNextMonday().plusYears(1);

        while (nextMonday.isBefore(temp)) {
            System.out.println(nextMonday);
            nextMonday = nextMonday.plusDays(7);
        }
    }

    private static LocalDate findNextMonday() {
        LocalDate today = LocalDate.now();
        for (int index = 0; index < 7; index++) {
            today = today.plusDays(1);
            if (today.getDayOfWeek().getValue() == 1) {
                return today;
            }
        }
        return null;
    }
}
