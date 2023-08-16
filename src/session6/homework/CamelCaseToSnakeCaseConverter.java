package session6.homework;

import java.util.Scanner;

/*
 *Description: Write a program using StringBuilder to convert a given CamelCase
 * string to snake_case. For instance, "thisIsCamelCase" would become "this_is_camel_case".
 * */
public class CamelCaseToSnakeCaseConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a CamelCase string: ");
        String camelCase = scanner.nextLine();

        String snakeCase = convertToSnakeCase(camelCase);
        System.out.println("Snake Case: " + snakeCase);

        scanner.close();
    }

    public static String convertToSnakeCase(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = input.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                stringBuilder.append('_');
            }
            stringBuilder.append(Character.toLowerCase(chars[i]));
        }
        return stringBuilder.toString();
    }
}
