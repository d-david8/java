package codingkata.session7;

public class LongestPalindromicSubstring {

    public static boolean isPalindrome(String str) {
        String newString = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return newString.equals(new StringBuilder(newString).reverse().toString());
    }

    public static void main(String[] args) {
        String s = "babad";
        String longestPalindromicSubstring = getLongestPalindromicSubstring(s);
        System.out.println("Longest Palindromic Substring: " + longestPalindromicSubstring);
    }

    private static String getLongestPalindromicSubstring(String s) {
        String longestPalindrome = "";
        for (int len = s.length(); len > 0; len--) {
            for (int startIndex = 0; startIndex <= s.length() - len; startIndex++) {
                String wordToCheck = s.substring(startIndex, startIndex + len);
                if (isPalindrome(wordToCheck)) {
                    longestPalindrome = wordToCheck;
                    return longestPalindrome;
                }
            }
        }
        return longestPalindrome;
    }
}
