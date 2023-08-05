package session3.homework;

import java.util.Scanner;

/*
 * Write a program that reverses the sign of an entered integer using unary minus operator.
 * */
public class UnaryOperators_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the value of the variable: ");
        int variableValue = scanner.nextInt();
        int variableBeforeUsingOperator = variableValue;

        variableValue = -variableValue;
        System.out.println("Using -" + variableBeforeUsingOperator + ": " + variableValue);
    }
}
