package session3.homework;

/*
 * Create a Java program that demonstrates the use of each compound
 * assignment operator with integers.
 * */
public class AssignmentAndCompoundAssignmentOperators_1 {

    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 5;

        System.out.println("First number: " + firstNumber);
        System.out.println("Second number: " + secondNumber);

        int firstNumberBefore = firstNumber;
        firstNumber += secondNumber;
        System.out.println(firstNumberBefore + " += " + secondNumber + " => First number: " + firstNumber);

        firstNumberBefore = firstNumber;
        firstNumber -= secondNumber;
        System.out.println(firstNumberBefore + " -= " + secondNumber + " => First number: " + firstNumber);

        firstNumberBefore = firstNumber;
        firstNumber *= secondNumber;
        System.out.println(firstNumberBefore + " *= " + secondNumber + " => First number: " + firstNumber);

        firstNumberBefore = firstNumber;
        firstNumber /= secondNumber;
        System.out.println(firstNumberBefore + " /= " + secondNumber + " => First number: " + firstNumber);

        firstNumberBefore = firstNumber;
        firstNumber %= secondNumber;
        System.out.println(firstNumberBefore + " %= " + secondNumber + " => First number: " + firstNumber);
    }
}
