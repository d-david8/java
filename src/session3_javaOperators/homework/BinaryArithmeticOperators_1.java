package session3_javaOperators.homework;

import java.util.Scanner;

/*
 * Write a Java program to take two numbers as input and display the result of addition,
 * subtraction, multiplication, division, and modulus.
 * */
public class BinaryArithmeticOperators_1 {

    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        int sum;
        int difference;
        int product;
        int division;
        int modulus;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give the first number: ");
        firstNumber = scanner.nextInt();
        System.out.print("Give the second number: ");
        secondNumber = scanner.nextInt();

        sum = firstNumber + secondNumber;
        difference = firstNumber - secondNumber;
        product = firstNumber * secondNumber;
        division = firstNumber / secondNumber;
        modulus = firstNumber / secondNumber;

        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
        System.out.println(firstNumber + " - " + secondNumber + " = " + difference);
        System.out.println(firstNumber + " * " + secondNumber + " = " + product);
        System.out.println(firstNumber + " / " + secondNumber + " = " + division);
        System.out.println(firstNumber + " % " + secondNumber + " = " + modulus);

        scanner.close();
    }
}
