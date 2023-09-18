package session16.practice;

import java.util.function.Function;

public class ExploreFunctionalInterfaces {

    public static void main(String[] args) {

        Function<String, Integer> stringLengthFinder = str -> str.length();
        System.out.println(stringLengthFinder.apply("Hello World"));
    }
}
