package session6_javaCoreAPIs.homework;

import java.util.Scanner;

/*
 * Description: Develop a program that checks if two provided strings are anagrams of each other
 * using the StringBuilder class. Anagrams are words or phrases made up of the same characters.
 * */
public class AnagramChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first string: ");
        String string1 = scanner.nextLine();

        System.out.println("Give the second string: ");
        String string2 = scanner.nextLine();

        if (areAnagrams(string1, string2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
        scanner.close();
    }

    public static boolean areAnagrams(String string1, String string2) {
        if (string1.length() != string2.length()) {
            return false;
        }

        StringBuilder stringBuilder1 = new StringBuilder(string1.toLowerCase());
        StringBuilder stringBuilder2 = new StringBuilder(string2.toLowerCase());

        for (int i = 0; i < stringBuilder1.length(); i++) {
            char currentChar = stringBuilder1.charAt(i);
            int index = stringBuilder2.indexOf(String.valueOf(currentChar));
            if (index == -1) {
                return false;
            }
            stringBuilder2.deleteCharAt(index);
        }
        return stringBuilder2.length() == 0;
    }
}