package session18_recap.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Problem 4
 * Given a List of strings, find which strings have duplicates and how many duplicates each string has.
 * Store this information in a HashMap where the key is the string and the value is the count of occurrences.
 * Print the resulting map.
 * */
public class StringDuplicate {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "apple", "plum", "orange");
        System.out.println(countStringDuplicates(list));
    }

    private static HashMap<String, Long> countStringDuplicates(List<String> input) {
        return (HashMap<String, Long>) input.stream()
                .collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));
    }
}
