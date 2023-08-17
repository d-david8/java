package session6.homework;

import java.util.Scanner;

/*
 * Description: Given a compressed string like "a3b2c4", expand it to "aaabbcccc",
 * making use of the StringBuilder class.
 * */
public class ExpandCompressedStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a compressed string: ");
        String compressedString = scanner.nextLine();

        String expandedString = expandString(compressedString);
        System.out.println("Expanded string: " + expandedString);

        scanner.close();
    }

    public static String expandString(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = input.toCharArray();

        for (int index = 0; index < chars.length; index++) {
            if (Character.isDigit(chars[index])) {
                for (int i = 0; i < chars[index] - '0'; i++) {
                    stringBuilder.append(chars[index - 1]);
                }
            }
        }
        return stringBuilder.toString();
    }
}