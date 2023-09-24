package session16_lambdaAndFunctionalInterfaces.homework.lambda_exercises;

/*
 * Create a functional interface that takes a string and an integer n as parameters and returns a string.
 * Implement it using a lambda expression that returns the first n characters of the string.
 * If n is larger than the length of the string, it should return the full string.
 * */
public class SubstringTest {

    public static void main(String[] args) {
        Substring substring = ((string, n) -> string.length() <= n ? string : string.substring(0, n));
        System.out.println(substring.getSubstring("John", 100));
        System.out.println(substring.getSubstring("John", 2));
    }
}
