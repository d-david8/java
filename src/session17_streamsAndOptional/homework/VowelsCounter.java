package session17_streamsAndOptional.homework;

/*
 * Given a string, use streams to count the number of vowels in it.
 * (Input: String sentence = "Hello World";)
 * */
public class VowelsCounter {

    public static void main(String[] args) {
        String sentence = "Hello World";
        long vowelCount = sentence.chars()
                .mapToObj(ch -> (char) ch)
                .filter(ch -> "AEIOUaeiou".indexOf(ch) >= 0)
                .count();
        System.out.println("Number of vowels: " + vowelCount);
    }
}
