package session16.homework.lambda_exercises;

import java.util.ArrayList;
import java.util.List;

/*
 * Create a functional interface with a method that takes a List<String> representing first names and
 * returns a List<String> of those names formatted in uppercase. Implement it using a lambda expression.
 * */
public class NameFormatterTest {

    public static void main(String[] args) {
        NameFormatter nameFormatter = names -> {
            List<String> upperCaseList = new ArrayList<>();
            names.forEach(name -> upperCaseList.add(name.toUpperCase()));
            return upperCaseList;
        };
        List<String> firstNames = List.of("John", "Alice", "Bob", "David");
        List<String> formattedNames = nameFormatter.formatNames(firstNames);
        formattedNames.forEach(System.out::println);
    }
}
