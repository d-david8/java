package session8_arrayListVsLinkedListAndWrappers.homework;

import java.util.Scanner;

/*
 * 9.Accept a string representation of a binary number, e.g., "1011".
 * Convert this string into an Integer using the Integer wrapper class and the method that parses binary.
 * Print out the decimal representation of this number.
 * */
public class BinaryToInt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give the binary number: ");
        String binaryString = scanner.nextLine();

        int intValue = Integer.parseInt(binaryString, 2);

        System.out.println("Int value: " + intValue);

    }
}
