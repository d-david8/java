package session6.homework;

import java.util.Scanner;

/*
 * Description: Write a program that capitalizes the first letter of every
 * word in a sentence using the StringBuilder class.
 * */
public class WordCapitalizer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a sentence: ");
        String sentence = scanner.nextLine();

        String result = capitalizeFirstLetters(sentence);
        System.out.println("Result: " + result);

        scanner.close();
    }

    public static String capitalizeFirstLetters(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] charArray = input.toCharArray();

        stringBuilder.append(Character.toUpperCase(charArray[0]));
        for (int i = 1; i < charArray.length; i++) {
            if (Character.isWhitespace(charArray[i - 1])) {
                stringBuilder.append(Character.toUpperCase(charArray[i]));
            } else {
                stringBuilder.append(charArray[i]);
            }
        }
        return stringBuilder.toString();
    }
}
