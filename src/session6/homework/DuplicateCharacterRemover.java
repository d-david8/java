package session6.homework;

import java.util.Scanner;

/*
 * Description: Design a program using StringBuilder that removes
 * duplicate characters from a string. For example, "balloon" should become "balon".
 * */
public class DuplicateCharacterRemover {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a string: ");
        String string = scanner.nextLine();

        String result = removeDuplicates(string);
        System.out.println("Result: " + result);

        scanner.close();
    }

    public static String removeDuplicates(String input) {
        StringBuilder stringBuilder = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (stringBuilder.indexOf(Character.toString(c)) == -1) {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }
}
