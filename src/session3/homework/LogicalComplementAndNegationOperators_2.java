package session3.homework;

import java.util.Scanner;

/*
 *  Write a Java program that takes two boolean inputs from a user. Apply the logical negation
 * operator (!) to each and print the result.
 * */
public class LogicalComplementAndNegationOperators_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first boolean value (true/false): ");
        boolean firstInput = scanner.nextBoolean();

        System.out.print("Enter the second boolean value (true/false): ");
        boolean secondInput = scanner.nextBoolean();

        boolean negationFirst = !firstInput;
        boolean negationSecond = !secondInput;

        System.out.println("Logical negation of the " + firstInput + ": " + negationFirst);
        System.out.println("Logical negation of the " + secondInput + ": " + negationSecond);

        scanner.close();
    }
}
