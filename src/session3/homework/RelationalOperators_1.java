package session3.homework;

import java.util.Scanner;

/*
 * Write a Java program that takes two numbers from the user and uses relational
 * operators to display whether the first number is greater than, less than,
 * or equal to the second number.
 * */
public class RelationalOperators_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Give the second number: ");
        int secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println(firstNumber + " is greater than " + secondNumber);
        } else if (firstNumber < secondNumber) {
            System.out.println(firstNumber + " is less than " + secondNumber);
        } else {
            System.out.println(firstNumber + " is equal to " + secondNumber);
        }
        scanner.close();
    }
}
