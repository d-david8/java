package session6.homework;

import java.util.Scanner;

/*
 * Description: Write a Java program that inserts a given string into
 * another string at a specified index using the StringBuilder class.
 * */
public class InsertingAtIndex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give the string: ");
        String originalString = scanner.nextLine();

        System.out.print("Give the string to insert: ");
        String insertString = scanner.nextLine();

        System.out.print("Give the index to insert at: ");
        int insertIndex = scanner.nextInt();

        String result = insertString(originalString, insertString, insertIndex);
        System.out.println("Result: " + result);

        scanner.close();
    }

    public static String insertString(String originalString, String stringToInsert, int index) {
        StringBuilder stringBuilder = new StringBuilder(originalString);
        return stringBuilder.insert(index, stringToInsert).toString();
    }
}