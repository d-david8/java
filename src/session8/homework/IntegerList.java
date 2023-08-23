package session8.homework;

import java.util.Scanner;

/* 4. Given an array of 10 integers, count how many of them are even numbers and how many are odd.
 * Print out both counts.
 */
public class IntegerList {

    public static void main(String[] args) {
        printOddEvenNumbers();
    }

    private static void printOddEvenNumbers() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int oddNumbers = 0;
        int evenNumbers = 0;

        System.out.println("Give the numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers++;
            } else {
                oddNumbers++;
            }
        }
        System.out.println("Count of the even numbers: " + evenNumbers);
        System.out.println("Count of odd numbers: " + oddNumbers);

        scanner.close();
    }
}
