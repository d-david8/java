package session6_javaCoreAPIs.homework;

import java.util.Scanner;

/*
 * Description: Create a Java program that uses the StringBuilder
 * class to remove all the vowels from an input string.
 * */
public class RemovingVowels {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a string: ");
        String input = scanner.nextLine();

        String result = removeVowels(input);
        System.out.println("String without vowels: " + result);

        scanner.close();
    }

    public static String removeVowels(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] charArray = input.toCharArray();
        String Vowels = "aeiouAEIOU";
        for (char c : charArray) {
            if (Vowels.indexOf(c) == -1) {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }
}
