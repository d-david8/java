package session6.homework;

import java.util.Scanner;

/*
 * Description: Write a program that checks whether a given string is a palindrome
 * using the StringBuilder class. A palindrome is a word, phrase, number, or other
 * sequences of characters that reads the same forward and backward.
 * */
public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a string: ");
        String sentence = scanner.nextLine();

        if (isPalindrome(sentence)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String input) {
        StringBuilder stringBuilder = new StringBuilder(input);
        String reversed = stringBuilder.reverse().toString();
        return input.equalsIgnoreCase(reversed);
    }
}
