package session6.homework;

import java.util.Scanner;

/*
 * Description: Using StringBuilder, write a program that counts the frequency
 * of each character in a string.
 * */
public class FrequencyCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = charactersFrequency(input);
        System.out.println("Result:\n" + result);

        scanner.close();
    }

    public static String charactersFrequency(String input) {
        int[] frequencyArray = new int[256];
        StringBuilder stringBuilder = new StringBuilder();

        for (char c : input.toCharArray()) {
            frequencyArray[c]++;
        }

        System.out.println("Character frequency:");
        for (int i = 0; i < frequencyArray.length; i++) {
            if (frequencyArray[i] > 0) {
                stringBuilder.append("'" + (char) i + "': " + frequencyArray[i] + "\n");
            }
        }
        return stringBuilder.toString();
    }
}