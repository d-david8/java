package session3_javaOperators.homework;

import java.util.Scanner;

/*
 * Write a program to check if a number is positive or negative using logical complement operator.
 * */
public class LogicalComplementAndNegationOperators_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give the number: ");
        int number = scanner.nextInt();

        System.out.println("The number is: " + (!(number < 0) ? "positive." : "negative"));
        scanner.close();
    }
}