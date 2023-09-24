package session4_javaOperatorsAndLoops.homework;

import java.util.Scanner;

/*
 * 2.  Write a Java program to declare two integer variables firstNumber
 * and secondNumber with any values. Use an equality operator to compare
 * these two numbers and print the result. Do the same for two String objects
 * firstString and secondString with the same value, but use the equals() method
 * for comparison. Print the result.
 * */
public class Exercise2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Give the second number: ");
        int secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("First number is greater then the second number.");
        } else if (firstNumber < secondNumber) {
            System.out.println("first number is smaller then the second number.");
        } else {
            System.out.println("The numbers are equals.");
        }

        scanner.close();
        String firstString = "String1";
        String secondString = "String2";

        System.out.println("First string: " + firstString);
        System.out.println("Second string: " + secondString);
        if (firstString.equals(secondString)) {
            System.out.println("The strings are the same");
        } else {
            System.out.println("The strings are different");
        }
    }
}