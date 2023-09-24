package session1_javaBasics.homework;

import java.util.Scanner;
/*
 *4. Simple Input/Output: Write a program that asks the user to enter two numbers, performs
 * addition on those numbers, and prints out the result.
 */

public class Exercise4 {
    public static void main(String[] args) {
        //declaration of the variables
        int firstNumber, secondNumber;

        //reading the first number
        System.out.print("Give the first number: ");
        firstNumber = new Scanner(System.in).nextInt();

        //reading the second number
        System.out.print("Give the second number: ");
        secondNumber = new Scanner(System.in).nextInt();

        //printing the sum
        System.out.println("The sum of the numbers is " + (firstNumber + secondNumber));
    }
}