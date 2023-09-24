package session3_javaOperators.homework;

import java.util.Scanner;
/* Create a program that takes an integer as input and then increments and decrements
 * it by 1, displaying the output at each stage.
 * */
public class IncrementAndDecrementOperators_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int number = scanner.nextInt();

        System.out.println("Initial value: " + number);
        number++;
        System.out.println("After increment: " + number);

        number--;
        System.out.println("After decrement: " + number);

        scanner.close();
    }
}
