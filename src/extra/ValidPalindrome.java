package extra;

import java.util.Scanner;

public class ValidPalindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a string");
        String aString = scanner.nextLine();
        if (isPalindrome(aString)) {
            System.out.println("The string is palindrome");
        } else {
            System.out.println("The string is not palindrome");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String str) {
        String newString = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return newString.equals(new StringBuilder(newString).reverse().toString());
    }
}
