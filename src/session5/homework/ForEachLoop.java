package session5.homework;

import java.util.Scanner;

/*
 * Given an array of integers, write a program that prints each number in the
 * array followed by "Even" if the number is even, or "Odd" if the number is odd.
 * Utilize a for-each loop for this task.
 * */
public class ForEachLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give the size of the array: ");
        int size = scanner.nextInt();
        int array[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Give the element " + i + ": ");
            array[i] = scanner.nextInt();
        }

        for (int item : array) {
            System.out.println(item + (item % 2 == 0 ? " Even" : " Odd"));
        }

        scanner.close();
    }
}
