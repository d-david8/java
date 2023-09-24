package session17_streamsAndOptional.homework;

import java.util.Arrays;
import java.util.List;

/*
 * Using streams, find the total number of characters across a list of strings excluding whitespace characters.
 * (Input: List<String> strings = Arrays.asList("Java Streams", "Method References", "Lambda Expressions");)

 * */
public class TotalCharacters {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java Streams", "Method References", "Lambda Expressions");
        Integer s = strings.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .mapToInt(String::length)
                .sum();
        System.out.println(s);
    }
}
