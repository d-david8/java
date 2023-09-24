package session17.streamsAndOptional.homework;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class LongestWordFromFile {

    public static void main(String[] args) {
        Path fileName = Path.of("/Users/david/java/src/session17/streamsAndOptional/homework/longest_word.txt");

        try {
            String content = Files.readString(fileName);
            String[] words = content.split("\\s+");

            Optional<String> longestWord = Arrays.stream(words)
                    .max(Comparator.comparingInt(String::length));

            longestWord.ifPresent(word -> System.out.println("Longest word: " + word));
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}
