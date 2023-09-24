package session6_javaCoreAPIs.homework;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

/*
 * Description: Given a list of strings, use StringBuilder to concatenate
 * them into a single string efficiently.
 * */
public class ConcatenateMultipleStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> stringList = new ArrayList<>();

        System.out.println("Give sentences (enter \"exit\" to end the reading):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            stringList.add(input);
        }

        String concatenatedString = concatenateStrings(stringList);
        System.out.println("Concatenated String: " + concatenatedString);

        scanner.close();
    }

    public static String concatenateStrings(List<String> strings) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : strings) {
            stringBuilder.append(str);
        }
        return stringBuilder.toString();
    }
}
