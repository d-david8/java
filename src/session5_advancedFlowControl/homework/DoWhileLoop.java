package session5_advancedFlowControl.homework;

import java.util.Random;
import java.util.Scanner;

/*
 * Create a program where the user is prompted to guess a predefined number.
 * After each guess, the program should inform the user if the guess is too
 * high or too low. The program should keep prompting the user until they guess
 * correctly. Using a do-while loop, ensure the user is always asked at least once.
 * */
public class DoWhileLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(10)+1;
        int userGuess;

        System.out.println("Try to guess the number between 1 and 10.");
        do {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();

            if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("You guessed the correct number: " + randomNumber);
            }
        } while (userGuess != randomNumber);

        scanner.close();
    }
}
