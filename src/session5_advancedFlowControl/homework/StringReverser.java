package session5_advancedFlowControl.homework;

import java.util.Scanner;

/*
 * Ask the user to enter a string. Print the reversed version of this string.
 * */
public class StringReverser {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String aString = scanner.nextLine();

        String reversedString = new StringBuilder(aString).reverse().toString();
        System.out.println("Reversed string: " + reversedString);

        scanner.close();
    }
}
