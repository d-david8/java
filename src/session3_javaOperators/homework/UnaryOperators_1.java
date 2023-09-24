package session3_javaOperators.homework;

/* Create a Java program where you increment and decrement the same variable.
 * Display the value of the variable after each operation.
 */

import java.util.Scanner;

public class UnaryOperators_1 {
    public static void main(String[] args) {
        int variableValue;
        int variableBeforeUsingOperator;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give the value of the variable: ");
        variableValue = scanner.nextInt();

        variableBeforeUsingOperator = variableValue;
        System.out.println("In context: ++" + variableBeforeUsingOperator + ": " + (++variableValue));
        System.out.println("After using ++" + variableBeforeUsingOperator + ": " + variableValue);
        variableBeforeUsingOperator = variableValue;
        System.out.println("In context " + variableBeforeUsingOperator + "++: " + (variableValue++));
        System.out.println("After using " + variableBeforeUsingOperator + "++: " + variableValue);

        variableBeforeUsingOperator = variableValue;
        System.out.println("In context: --" + variableBeforeUsingOperator + ": " + (--variableValue));
        System.out.println("After using --" + variableBeforeUsingOperator + ": " + variableValue);
        variableBeforeUsingOperator = variableValue;
        System.out.println("In context " + variableBeforeUsingOperator + "--: " + (variableValue--));
        System.out.println("After using " + variableBeforeUsingOperator + "--: " + variableValue);

        scanner.close();
    }
}
