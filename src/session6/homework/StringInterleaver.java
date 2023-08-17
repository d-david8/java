package session6.homework;

import java.util.Scanner;

/*
 * Description: Write a program using StringBuilder that interleaves two strings.
 * For instance, given "abc" and "123", the result should be "a1b2c3".
 * */
public class StringInterleaver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give the first string: ");
        String string1 = scanner.nextLine();

        System.out.print("Give the second string: ");
        String string2 = scanner.nextLine();

        String result = interleaveStrings(string1, string2);
        System.out.println("Result: " + result);

        scanner.close();
    }

    public static String interleaveStrings(String string1, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        int minLength = string1.length() < string2.length() ? string1.length() : string2.length();

        for (int i = 0; i < minLength; i++) {
            stringBuilder.append(string1.charAt(i));
            stringBuilder.append(string2.charAt(i));
        }

        if (string1.length() > minLength) {
            stringBuilder.append(string1.substring(minLength));
        } else if (string2.length() > minLength) {
            stringBuilder.append(string2.substring(minLength));
        }

        return stringBuilder.toString();
    }
}
