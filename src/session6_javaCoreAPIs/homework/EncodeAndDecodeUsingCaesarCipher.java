package session6_javaCoreAPIs.homework;

import java.util.Scanner;

/*
 * Description: Implement a Caesar Cipher encoder and decoder using the StringBuilder
 * class. The Caesar Cipher involves rotating letters a certain number of steps
 * down or up the alphabet. For example, with a shift of 1, 'A' would be replaced
 * by 'B', 'B' would become 'C', and so on.
 * */
public class EncodeAndDecodeUsingCaesarCipher {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give the message: ");
        String input = scanner.nextLine();

        System.out.print("Enter the shift value: ");
        int shift = scanner.nextInt();

        String encodedMessage = encodeMessage(input, shift);
        System.out.println("Encoded message: " + encodedMessage);

        String decodedMessage = decodeMessage(encodedMessage, shift);
        System.out.println("Decoded message: " + decodedMessage);

        scanner.close();
    }

    public static String encodeMessage(String input, int shift) {
        StringBuilder encoded = new StringBuilder();

        for (char c : input.toCharArray()) {
                encoded.append((char)(c + shift));
        }
        return encoded.toString();
    }

    public static String decodeMessage(String input, int shift) {
        StringBuilder encoded = new StringBuilder();

        for (char c : input.toCharArray()) {
            encoded.append((char)(c - shift));
        }
        return encoded.toString();
    }
}
