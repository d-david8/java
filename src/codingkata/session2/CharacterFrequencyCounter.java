package codingkata.session2;

import java.util.Scanner;

public class CharacterFrequencyCounter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a sentence.");
        String sentance = scanner.nextLine();
        System.out.println(countLetters(sentance));
    }
    /**
     * returns pairs of letters and frequency in string format
     */
    public static String countLetters(String input){
        StringBuilder stringBuilder = new StringBuilder();
        int[] charFrequency = new int[256];
        for (char aChar : input.toCharArray()){
            if (Character.isLetter(aChar)){
                charFrequency[aChar]++;
            }
        }
        for (int index = 0; index < 256; index++){
            if (charFrequency[index] > 0){
                stringBuilder.append(charFrequency[index] +
                        " " + (char) index + "\n");
            }
        }
        return stringBuilder.toString();
    }

}
