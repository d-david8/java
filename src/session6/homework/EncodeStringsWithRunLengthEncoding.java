package session6.homework;

import java.util.Scanner;

/*
 * Description: Using StringBuilder, write a program that implements the Run-Length Encoding algorithm.
 * For instance, the string "AAABBBCCDAA" would be encoded as "3A3B2C1D2A".
 * */
public class EncodeStringsWithRunLengthEncoding {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a string: ");
        String input = scanner.nextLine();

        String encodedString = encodeRunLength(input);
        System.out.println("Encoded string: " + encodedString);

        scanner.close();
    }

    public static String encodeRunLength(String input) {
        StringBuilder stringBuilder = new StringBuilder();

        int count = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                stringBuilder.append(count).append(input.charAt(i - 1));
                count = 1;
            }
        }
        stringBuilder.append(count);
        stringBuilder.append(input.charAt(input.length() - 1));

        return stringBuilder.toString();
    }
}
