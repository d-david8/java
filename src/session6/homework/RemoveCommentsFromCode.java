package session6.homework;

import java.util.Scanner;

/*
 * Description: Create a Java program using StringBuilder that removes all single line
 * (//) and multi-line (/ *   * /) comments from a provided piece of code.
 * */
public class RemoveCommentsFromCode {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the code with comments:");
        StringBuilder input = new StringBuilder();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            input.append(line).append("\n");
            if (line.equals(""))
                break;
        }
        String result = removeComments(input.toString());
        System.out.println("Code without comments:\n" + result);

        scanner.close();
    }

    public static String removeComments(String input) {
        StringBuilder stringBuilder = new StringBuilder();

        // there are no comments
        if (!input.contains("//") && !input.contains("/*")) {
            return input;
        }

        //eliminate the inline comments if exists
        int startCommentIndex = input.indexOf("//");
        if (startCommentIndex != -1) {
            int currentIndex = 0;
            while (currentIndex < input.length() && startCommentIndex != -1) {
                startCommentIndex = input.indexOf("//", currentIndex);
                if (startCommentIndex != -1) {
                    stringBuilder.append(input.substring(currentIndex, startCommentIndex));
                    currentIndex = input.indexOf("\n", startCommentIndex) + 1;
                } else {
                    stringBuilder.append(input.substring(currentIndex));
                }
            }
        }

        //eliminate the multiline comments if exists
        startCommentIndex = input.indexOf("/*");
        if (startCommentIndex != -1) {
            input =stringBuilder.toString();
            stringBuilder = new StringBuilder();
            int currentIndex = 0;
            while (currentIndex < input.length() && startCommentIndex != -1) {
                startCommentIndex = input.indexOf("/*", currentIndex);
                if (startCommentIndex != -1) {
                    stringBuilder.append(input.substring(currentIndex, startCommentIndex));
                    currentIndex = input.indexOf("*/", startCommentIndex) + 2;
                } else {
                    stringBuilder.append(input.substring(currentIndex));
                }
            }
        }
        return stringBuilder.toString();
    }
}
