package session13.practice;

import java.util.Stack;

public class BracketChecker {

    public static void main(String[] args) {
        String myInput = "({[]}())";
        System.out.println(checkBracket(myInput));
    }

    public static boolean checkBracket(String input) {
        String openBrackets = "([{";
        String closingBrackets = ")]}";

        Stack<Character> brackets = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (openBrackets.indexOf(currentChar) != -1) {
                brackets.push(currentChar);
            } else if (closingBrackets.indexOf(currentChar) != -1) {
                char lastOpenBracket = brackets.pop();
                if (!equivalent(lastOpenBracket, currentChar)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean equivalent(char a, char b) {
        String openBrackets = "([{";
        String closingBrackets = ")]}";
        return openBrackets.indexOf(a) == closingBrackets.indexOf(b);
    }
}
