package session5.homework;

import java.util.Scanner;

/*
 * Write a program that asks the user to enter a number between 1 and 12.
 * Print the name of the corresponding month or "Invalid Month" if out of range.
 * */
public class MonthNameFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a number (1-12) for the month of the year: ");
        byte month = scanner.nextByte();

        String monthName;
        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "Invalid Month";
                break;
        }
        System.out.println("Corresponding month: " + monthName);

        scanner.close();
    }
}
