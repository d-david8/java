package session17_streamsAndOptional.homework;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Given a list of strings, use streams to create a single string which is a concatenation of all strings
 * separated  by a comma. (Input: List<String> strings = Arrays.asList("one", "two", "three", "four");)*/
public class StringConcatenation {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("one", "two", "three", "four");
        String result = strings.stream()
                .collect(Collectors.joining(","));
        System.out.println("String concatenation: " + result);
    }
}
