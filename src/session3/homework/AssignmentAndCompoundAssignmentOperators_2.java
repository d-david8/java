package session3.homework;

import java.util.Scanner;

/*
 * Write a program to calculate the price after discount. Take the original
 * price and discount percentage as input. Use compound assignment operator
 * to perform the calculation.
 * */
public class AssignmentAndCompoundAssignmentOperators_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give the price: ");
        double price = scanner.nextDouble();

        System.out.print("Give the discount(%): ");
        double discount = scanner.nextDouble();

        price -= (price * discount / 100);
        System.out.println("The new price is: " + price);
    }
}
