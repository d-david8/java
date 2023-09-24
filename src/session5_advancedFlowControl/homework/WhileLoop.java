package session5_advancedFlowControl.homework;

import java.util.Scanner;

/*
 * Write a program that asks the user to enter numbers. The program should continue
 * prompting the user until they enter -1. After they enter -1, print the sum of all
 * numbers entered (excluding -1).
 * */
public class WhileLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a number: ");
        int number = scanner.nextInt();

        int sum = 0;

        while (number != -1) {
            sum += number;

            System.out.print("Give a number: ");
            number = scanner.nextInt();
        }
        System.out.print("Sum of the numbers is: " + sum);

        scanner.close();
    }
}
