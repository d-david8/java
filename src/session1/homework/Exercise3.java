package session1.homework;

/*
 * 3. Operations: Write a program that performs various operations (addition, subtraction,
 * multiplication, division, and modulus) on two numbers. The numbers can be hard-coded into
 * the program. Print the result of each operation.
 */
public class Exercise3 {
    public static void main(String[] args) {
        int firstNumber = 32;
        int secondNumber = 5;

        System.out.println(
                firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber) + "\n" +
                        firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber) + "\n" +
                        firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber) + "\n" +
                        firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber) + "\n" +
                        firstNumber + " % " + secondNumber + " = " + (firstNumber % secondNumber)
        );
    }
}
