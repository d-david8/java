package session17.streamsAndOptional.homework;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * Given a list of sentences, use flatMap to create a list of all words in all the sentences,
 * and then find the most frequently occurring word. (Input: List<String> sentences =
 * Arrays.asList("Hello World", "Hello Everyone", "Welcome to the World of Java");)
 * */
public class MostFrequentWord {

    public static void main(String[] args) {
        List<String> sentences = Arrays.asList("Hello World", "Hello Everyone", "Welcome to the World of Java");

        String mappedWords = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .collect(Collectors.groupingBy(String::toString, Collectors.counting()))
                .entrySet().stream()
                .max(Comparator.comparingLong(Map.Entry::getValue))
                .map(Map.Entry::getKey).orElse("");
        System.out.println(mappedWords);
    }
}
