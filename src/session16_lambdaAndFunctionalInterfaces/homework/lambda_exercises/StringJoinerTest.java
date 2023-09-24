package session16_lambdaAndFunctionalInterfaces.homework.lambda_exercises;

/*
 * Create a functional interface with a method that takes two strings and returns a string.
 * Implement this interface using a lambda expression to create a utility that joins two strings
 * with a space in between.
 */
public class StringJoinerTest {

    public static void main(String[] args) {
        StringJoiner joiner = (firstString, secondString) -> firstString + " " + secondString;

        System.out.println(joiner.join("Dan", "David"));
    }
}
