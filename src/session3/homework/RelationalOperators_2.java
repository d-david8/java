package session3.homework;

import java.util.Scanner;

/*
 * Create a program that checks if a user entered number is within a
 * specific range (e.g., 1-100). Use relational operators for the checks.
 * */
public class RelationalOperators_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a number: ");
        int number = scanner.nextInt();

        if (number >= 1 && number <= 100) {
            System.out.println("The number is within the range [1-100].");
        } else {
            System.out.println("The number is outside the range [1-100].");
        }

        scanner.close();
    }
}
