package session18_recap.practice;

/*
 * Problem 5 Given a sentence, reverse the order of the words in the sentence, but not the
 * order of the letters in each word. For instance, "Java is fun" should become "fun is Java".
 * */
public class SentenceReverser {

    public static void main(String[] args) {
        String sentence = "Around the world, around the world";
        System.out.println(reverseSentence(sentence));
    }

    private static String reverseSentence(String input) {
        String[] words = input.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int index = words.length - 1; index > 0; index--) {
            stringBuilder.append(words[index]);
            stringBuilder.append(" ");
        }
        stringBuilder.append(words[0]);
        return stringBuilder.toString();
    }
}
