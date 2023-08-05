package session3.homework;

import java.util.Scanner;

/*
 * Write a program that calculates the area of a rectangle. Take the length and breadth as inputs.
 * */
public class BinaryArithmeticOperators_2 {

    public static void main(String[] args) {
        int length;
        int breadth;
        int area;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give the length of the rectangle: ");
        length = scanner.nextInt();
        System.out.print("Give the breadth of the rectangle: ");
        breadth = scanner.nextInt();

        area = length * breadth;
        System.out.println("The area of the rectangle is: " + area);

        scanner.close();
    }
}