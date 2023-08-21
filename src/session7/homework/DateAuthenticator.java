package session7.homework;

import java.util.Scanner;

/*
 * Description: Engineer a method named isValidDate that captures a date string from the
 * console and assesses if it conforms to a valid date format (YYYY-MM-DD).
 * The method should also consider leap years when validating February dates.
 * Input: A string of a date from the console.
 * Expected Output:
 * true if the input adheres to the date format and denotes a genuine date.
 * false if otherwise.
 * */
public class DateAuthenticator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give the first date: ");
        String stringDate = scanner.nextLine();

        if (isVaalidFormatDate(stringDate)) {
            if (isValidDate(stringDate)) {
                System.out.println("The given date is  valid");
            } else {
                System.out.println("The given date is not valid");
            }
        } else {
            System.out.println("The date is not in the valid format YYYY-MM-DD");
        }

        scanner.close();
    }

    public static boolean isValidDate(String stringDate) {
        int year = Integer.parseInt(stringDate.split("-")[0]);
        int month = Integer.parseInt(stringDate.split("-")[1]);
        int day = Integer.parseInt(stringDate.split("-")[2]);

        if (year > 3000 || year < 1) {
            return false;
        }
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                if (day > 31)
                    return false;
            }
            case 4, 6, 9, 11 -> {
                if (day > 30)
                    return false;
            }
            case 2 -> {
                if (year % 4 == 0 && day > 29)
                    return false;
                if (year % 4 != 0 && day > 28)
                    return false;
            }
            default -> {
                return false;
            }
        }
        return true;
    }

    public static boolean isVaalidFormatDate(String stringDate) {
        if (stringDate.length() != 10) {
            return false;
        } else {
            for (int i = 0; i < stringDate.length(); i++) {
                if ((i == 4 || i == 7) && stringDate.charAt(i) != '-') {
                    return false;
                }
                if ((i != 4 && i != 7) && !Character.isDigit(stringDate.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }
}
