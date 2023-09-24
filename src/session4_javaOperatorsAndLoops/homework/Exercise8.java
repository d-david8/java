package session4_javaOperatorsAndLoops.homework;

import java.util.Scanner;

/*
 * 8. Write a Java program to calculate the factorial of a number using a for loop.
 * Declare an integer variable number and assign a value to it. Then calculate and print
 * the factorial of number.
 * */
public class Exercise8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give an integer: ");
        int number = scanner.nextInt();
        long factorial = 1;

        for (int i = 0; i < number; ) {
            factorial *= ++i;
        }
        System.out.println("Factorial of " + number + " is " + factorial);

        System.out.println("Factorial of " + number + " using recursion is " + factorialRecursion(number));

        scanner.close();
    }

    public static long factorialRecursion(int n) {
        return n == 1 ? 1 : n * factorialRecursion(n - 1);
    }
}
