package session16.homework.lambda_exercises;

/*
 *Create a functional interface with a method that takes two strings as input and returns an integer.
 * Implement this interface using a lambda expression to create a custom comparator that compares strings
 * based on their length (not lexicographically).
 * */
public class TestMaxLength {

    public static void main(String[] args) {

        MaxLength maxLength = (string1, string2) -> string1.length() - string2.length();
        String string1 = "Alice";
        String string2 = "Bob";
        if (maxLength.compareTo(string1, string2) > 0) {
            System.out.println("Length of " + string1 + " > length of " + string2);
        } else if (maxLength.compareTo(string1, string2) < 0) {
            System.out.println("Length of " + string1 + " < length of " + string2);
        } else {
            System.out.println("Length of " + string1 + " = length of " + string2);
        }
    }
}
