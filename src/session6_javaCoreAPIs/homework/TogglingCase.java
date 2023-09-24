package session6_javaCoreAPIs.homework;

import java.util.Scanner;

/*
 * Description: Design a program using StringBuilder that toggles the case of every character
 * in a given string. For example, "HelLo" should become "hELlO".
 * */
public class TogglingCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String toggledString = toggleCase(input);
        System.out.println("Result: " + toggledString);

        scanner.close();
    }

    public static String toggleCase(String input) {
        StringBuilder stringBuilder = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                stringBuilder.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                stringBuilder.append(Character.toUpperCase(c));
            } else {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }
}