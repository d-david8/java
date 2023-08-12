package session5.homework;

import java.util.Scanner;

/*
 * Write a Java program that takes an integer as input. If the number is even,
 * print "Even". If it's odd, print "Odd".
 * */
public class EvenOrOddChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        scanner.close();
    }
}
