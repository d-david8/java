package session5_advancedFlowControl.homework;

import java.util.Scanner;

/*
 * Create a program that asks the user for 10 numbers. Print the sum of all
 * numbers that are greater than 5. If the user enters a number less than or
 * equal to 5, use the continue statement to skip the addition for that number.
 * */
public class ContinueStatement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        System.out.println("Give 10 numbers:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Give number " + (i + 1) + ": ");
            int nummber = scanner.nextInt();

            if (nummber <= 5) {
                continue;
            }

            sum += nummber;
        }
        System.out.println("Sum of numbers greater than 5 is: " + sum);

        scanner.close();
    }
}
