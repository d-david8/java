package session6_javaCoreAPIs.homework;

import java.util.Scanner;

/*
 * Description: Develop a program that checks if a string has balanced parentheses ((, ), {, }, [, and ])
 * using StringBuilder. The program should return true if the parentheses in the string are balanced and
 * false otherwise.
 * */
public class BalancedParenthesisChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give the string: ");
        String input = scanner.nextLine();
        if (checkBalancedParentheses(input)) {
            System.out.println("The parentheses are balanced.");
        } else {
            System.out.println("The parentheses are not balanced.");
        }
        scanner.close();
    }

    public static boolean checkBalancedParentheses(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        String parantesis = "{[()]}";
        for (char ch : input.toCharArray()) {
            if (parantesis.indexOf(ch) != -1) {
                if (ch == '(' || ch == '[' || ch == '{') {
                    stringBuilder.append(ch);
                } else if(stringBuilder.length()>0){
                    int lastParenthesis = stringBuilder.charAt(stringBuilder.length() - 1);
                    int lastIndex = stringBuilder.length()-1;

                    if (ch == ')' && lastParenthesis == '(') {
                        stringBuilder.deleteCharAt(lastIndex);
                    } else if (ch == ']' && lastParenthesis== '[') {
                        stringBuilder.deleteCharAt(lastIndex);
                    } else if (ch == '}' && lastParenthesis == '{') {
                        stringBuilder.deleteCharAt(lastIndex);
                    } else {
                        return false;
                    }
                }
                else {
                    return false;
                }
            }
        }
        return stringBuilder.length() == 0;
    }
}
