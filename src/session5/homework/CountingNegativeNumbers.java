package session5.homework;

import java.util.Scanner;

/*
 * Given an array of integers, write a program to count and print the number of
 * negative integers in the array.
 * */
public class CountingNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");

        int[] negativeArray = new int[size];
        int count = 0;

        for (int i = 0; i < size; i++) {
            System.out.print("Give the element " + i + ": ");
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < size; i++) {
            if (array[i] <= 0) {
                negativeArray[count++] = array[i];
            }
        }

        System.out.print("The negative elements: ");
        for (int i = 0; i < count; i++) {
            System.out.print(negativeArray[i] + " ");
        }
        System.out.println("\nThe count of the negative element is " + count);

        scanner.close();
    }
}
