package session8_arrayListVsLinkedListAndWrappers.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        for (int i = 0; i < 1000000; i++) {
            arrayList.add(String.valueOf(i));
            linkedList.add(String.valueOf(i));
        }
        long startTimerArrayList = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            arrayList.add(1, String.valueOf(i));
        }
        long endTimerArrayList = System.currentTimeMillis();

        long startTimerLinkedList = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            linkedList.add(1, String.valueOf(i));
        }
        long endTimerLinkedList = System.currentTimeMillis();

        System.out.println("ArrayList time " + (endTimerArrayList - startTimerArrayList));
        System.out.println("LinkedList time " + (endTimerLinkedList - startTimerLinkedList));

    }
}
