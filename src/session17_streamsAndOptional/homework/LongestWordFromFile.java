package session17_streamsAndOptional.homework;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

/*
 * Create a stream from a text file and use stream operations to find and print the longest word in the file.
 * */
public class LongestWordFromFile {

    public static void main(String[] args) {
        String fileName = "/Users/david/java/src/session17_streamsAndOptional/homework/longest_word.txt";

        try {
            Optional<String> longestWord = Files.lines(Path.of(fileName))
                    .flatMap(line -> Stream.of(line.split("\\s+")))
                    .max(Comparator.comparingInt(String::length));
            if (longestWord.isPresent()) {
                System.out.println("Longest word: " + longestWord.get());
            } else {
                System.out.println("File is empty.");
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}
