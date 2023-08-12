package session5.homework;

import java.util.Scanner;

/*
 * Create a menu-driven program where the user is presented with options:
 *
 * Print "Hello World"
 * Print the user's name.
 * Exit.
 *
 * Based on the user's input, perform the necessary action. Once an action
 * is completed, show the menu again, unless the user chooses the Exit option.
 * Use jump statements to control the flow of the program.
 * */
public class JumpStatements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Print 'Hello World'");
            System.out.println("2. Print your name");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Hello World\n");
                    break;
                case 2:
                    System.out.println("Your name " + System.getProperty("user.name") + "\n");
                    break;
                case 3:
                    System.out.println("Exiting the program.\n");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please select a valid option.\n");
            }
        }
    }
}