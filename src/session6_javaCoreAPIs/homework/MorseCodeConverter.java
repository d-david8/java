package session6_javaCoreAPIs.homework;

import java.util.HashMap;
import java.util.Scanner;

/*
 * Description: Create a program that takes in a string and converts it to
 * Morse code using the StringBuilder class. For simplicity, you can assume
 * the input string only contains alphabets and numbers.
 * */
public class MorseCodeConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = stringToMorseCode(input);
        System.out.println("Result: " + result);

        scanner.close();
    }

    public static String stringToMorseCode(String input) {
        HashMap<Character, String> morseMap = createMorseCodeMap();
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = input.toUpperCase().toCharArray();

        for (char c : chars) {
            if (morseMap.containsKey(c)) {
                stringBuilder.append(morseMap.get(c));
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }

    public static HashMap<Character, String> createMorseCodeMap() {
        HashMap<Character, String> morseMap = new HashMap<>();
        morseMap.put('A', ".-");
        morseMap.put('B', "-...");
        morseMap.put('C', "-.-.");
        morseMap.put('D', "-..");
        morseMap.put('E', ".");
        morseMap.put('F', "..-.");
        morseMap.put('G', "--.");
        morseMap.put('H', "....");
        morseMap.put('I', "..");
        morseMap.put('J', ".---");
        morseMap.put('K', "-.-");
        morseMap.put('L', ".-..");
        morseMap.put('M', "--");
        morseMap.put('N', "-.");
        morseMap.put('O', "---");
        morseMap.put('P', ".--.");
        morseMap.put('Q', "--.-");
        morseMap.put('R', ".-.");
        morseMap.put('S', "...");
        morseMap.put('T', "-");
        morseMap.put('U', "..-");
        morseMap.put('V', "...-");
        morseMap.put('W', ".--");
        morseMap.put('X', "-..-");
        morseMap.put('Y', "-.--");
        morseMap.put('Z', "--..");
        morseMap.put('0', "-----");
        morseMap.put('1', ".----");
        morseMap.put('2', "..---");
        morseMap.put('3', "...--");
        morseMap.put('4', "....-");
        morseMap.put('5', ".....");
        morseMap.put('6', "-....");
        morseMap.put('7', "--...");
        morseMap.put('8', "---..");
        morseMap.put('9', "----.");
        return morseMap;
    }
}
