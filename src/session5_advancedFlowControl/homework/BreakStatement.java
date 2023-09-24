package session5_advancedFlowControl.homework;

import java.util.Scanner;

/*
 * Write a program that prompts the user to enter numbers. Calculate the average of
 * these numbers. If the user enters 0, break out of the input loop and then print
 * the average of the numbers entered so far.
 * */
public class BreakStatement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int count = 0;

        System.out.println("Give numbers to calculate their average.");

        while (true) {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            if (num == 0) {
                break;
            }
            sum += num;
            count++;
        }
        System.out.println("Average of the entered numbers: " + sum / count);

        scanner.close();
    }
}
