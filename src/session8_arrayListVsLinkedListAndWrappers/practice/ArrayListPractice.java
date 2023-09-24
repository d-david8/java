package session8_arrayListVsLinkedListAndWrappers.practice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Eva");
        names.add(2,"Frank");

        //names = {Alice, Bob, Frank, Charlie, Eva}
        //           0     1      2      3      4


        boolean isListEmpty = names.isEmpty();
        System.out.println("Is list empty? " + isListEmpty);

        //System.out.println(names);
        for (String name : names) {
            System.out.println(name);
        }


    }
}
