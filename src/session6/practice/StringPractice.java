package session6.practice;

import java.util.Arrays;

public class StringPractice {

    public static void main(String[] args) {
        String animal1 = "lion";
        String animal2 = new String("lion");
        String animal3 = "lion";

        String name = "AdrianPuscuta";

//        System.out.println( animal1 == animal2);
//        System.out.println( animal1 == animal3);

//        System.out.println("animal1 hashcode: " + Integer.toHexString(System.identityHashCode(animal1)));
//        System.out.println("animal2 hashcode: " + Integer.toHexString(System.identityHashCode(animal2)));
//        System.out.println("animal3 hashcode: " + Integer.toHexString(System.identityHashCode(animal3)));

//        garbageCollectorExample();

        User user = new User();
        user.setName("Ionut");

        user = new User();

//        stringConcat();

//        int animal1Length = getStringLength(animal1);
//        System.out.println(animal1Length);
//        System.out.println(animal1.length());
//
//        System.out.println(animal1.charAt(1));
//        System.out.println(getStringChar(animal1,1));

//        System.out.println(animal1.indexOf('i'));
//        System.out.println(name.substring(6));
//        System.out.println(name.substring(5,7));

//        System.out.println(name.toLowerCase());
//        System.out.println(name.toUpperCase());

//        System.out.println(getStringStartsWith(name,"Adrian"));
//        System.out.println(getStringEndsWith(name,"Puscuta"));

        String sentence = "   I like to eat apple pie";
//        System.out.println(sentence.contains("apple"));

//        System.out.println(sentence.replace('a','b'));

//        System.out.println(sentence);
//        System.out.println(sentence.trim());

//        sentence =sentence.trim();
//        System.out.println(sentence);

        sentence = sentence
                .trim()
                .replace('a','b')
                .toUpperCase();
        System.out.println(sentence);

    }

    public static void garbageCollectorExample() {
        String name = "Andrei";
        System.out.println(name);

        name = "Ion";
        System.out.println(name);
    }

    public static void stringConcat() {
        String value1 = "str1";
        String value2 = "str2";
        System.out.println(Integer.toHexString(System.identityHashCode(value1)));

        value1 = value1.concat(value2);
        System.out.println(Integer.toHexString(System.identityHashCode(value1)));
    }

    public static int getStringLength(String input) {
        return input.length();
    }

    public static char getStringChar(String input, int index) {
        return input.charAt(index);
    }

    public static boolean getStringStartsWith(String input, String startWith) {
        return input.startsWith(startWith);
    }

    public static boolean getStringEndsWith(String input, String endsWith) {
        return input.endsWith(endsWith);
    }
}

