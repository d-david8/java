package session6.homework;

import java.util.Scanner;

/*
 * Description: Use the StringBuilder class to replace every occurrence of a
 * substring within a given string with another substring. For instance,
 * replace "cat" with "dog" in the string "The cat sat on the mat."
 * */
public class StringReplacement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give the string: ");
        String sentence = scanner.nextLine();

        System.out.print("Give the substring to replace: ");
        String oldSubstring = scanner.nextLine();

        System.out.print("Give the replacement substring: ");
        String newSubstring = scanner.nextLine();

        String result = replaceSubstring(sentence, oldSubstring, newSubstring);
        System.out.println("Result: " + result);

        scanner.close();
    }

    public static String replaceSubstring(String original, String oldSubstring, String newSubstring) {
        StringBuilder stringBuilder = new StringBuilder();
        int currentIndex = 0;

        while (currentIndex < original.length()) {
            int nextIndex = original.indexOf(oldSubstring, currentIndex);

            if (nextIndex == -1) {
                stringBuilder.append(original.substring(currentIndex));
                return stringBuilder.toString();
            }

            stringBuilder.append(original.substring(currentIndex, nextIndex));
            stringBuilder.append(newSubstring);
            currentIndex = nextIndex + oldSubstring.length();
        }
        return stringBuilder.toString();
    }
}