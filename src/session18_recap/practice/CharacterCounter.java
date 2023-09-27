package session18_recap.practice;

import java.util.Arrays;

/*
 * Problem 1:
 * Given a sentence, count how many words in the sentence have more than three characters.
 * You can consider a word to be a sequence of characters separated by spaces.
 */
public class CharacterCounter {

    public static void main(String[] args) {
        String string = "Hello world ab";
        System.out.println(countWordsLongerThen(string, 1));
    }

    public static int countWordsLongerThen(String input, int len) {
        return (int) Arrays.stream(input.split(" "))
                .filter(word -> word.length() > len)
                .count();
    }
}
