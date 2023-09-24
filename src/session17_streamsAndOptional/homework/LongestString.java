package session17_streamsAndOptional.homework;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
 * Using a list of strings, find and print the longest string using Java streams.
 * (Input: List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");)
 * */
public class LongestString {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        String longest = strings.stream()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .toList().get(0);
        System.out.println("Longest string: " + longest);
    }
}
