package session6.homework;

import java.util.Scanner;

/*
 * Description: Design a Java program using StringBuilder that checks if a given pattern repeats
 * in a string. For instance, given the string "ababab", the repeating pattern is "ab".
 * */
public class PatternRecognition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a string: ");
        String input = scanner.nextLine();

        System.out.print("Give the pattern: ");
        String pattern = scanner.nextLine();

        boolean hasRepeatingPattern = hasRepeatingPattern(input, pattern);

        if (hasRepeatingPattern) {
            System.out.println("The pattern repeats in the string.");
        } else {
            System.out.println("The pattern does not repeat in the string.");
        }

        scanner.close();
    }

    //a pattern repeats in a string if it occurs at least 2 times in the string
    public static boolean hasRepeatingPattern(String input, String pattern) {
        int index = 0;
        int count =0;

        while(index < input.length()) {
            int indexPattern = input.indexOf(pattern,index);
            if(indexPattern != -1) {
                if(++count > 1) {
                    return true;
                }
            }
            index = indexPattern + pattern.length();
        }
        return false;
    }
}