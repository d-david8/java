package session6.homework;

import java.util.Scanner;

/*
 * Description: Use the StringBuilder class to write a program that reverses
 * an input string. For example, the input "hello" should return "olleh".
 * */
public class ReverseAString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a string: ");
        String sentence = scanner.nextLine();

        String reversed = reverseString(sentence);
        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }

    public static String reverseString(String input) {
        StringBuilder stringBuilder = new StringBuilder(input);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
