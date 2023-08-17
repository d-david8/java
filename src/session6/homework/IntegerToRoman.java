package session6.homework;

// https://leetcode.com/problems/integer-to-roman/

import java.util.Scanner;

public class IntegerToRoman {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        String roman = intToRoman(number);
        System.out.println("Roman: " + roman);

        scanner.close();
    }

    public static String intToRoman(int number) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder stringBuilder = new StringBuilder();
        int index = 0;

        while (number > 0) {
            int count = number / values[index];
            number %= values[index];

            for (int i = 0; i < count; i++) {
                stringBuilder.append(romans[index]);
            }
            index++;
        }
        return stringBuilder.toString();
    }
}