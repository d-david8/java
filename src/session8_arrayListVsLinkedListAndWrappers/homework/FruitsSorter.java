package session8_arrayListVsLinkedListAndWrappers.homework;

import java.util.ArrayList;
import java.util.List;

public class FruitsSorter {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("oranga");
        fruits.add("kiwi");
        fruits.add("pear");
        fruits.add("pineapple");
        fruits.add("banana");

        System.out.println("Original list of fruits: " + fruits);

        bubbleSort(fruits);

        System.out.println("Sorted list of fruits: " + fruits);
    }

    public static void bubbleSort(List<String> fruits) {
        boolean isChanged;
        String aux;
        do {
            isChanged = false;
            for (int i = 0; i < fruits.size() - 1; i++) {
                if (fruits.get(i).length() > fruits.get(i + 1).length() ||
                        (fruits.get(i).length() == fruits.get(i + 1).length() &&
                                fruits.get(i).compareTo(fruits.get(i + 1)) > 0)) {
                    aux = fruits.get(i);
                    fruits.set(i, fruits.get(i + 1));
                    fruits.set(i + 1, aux);
                    isChanged = true;
                }
            }
        }
        while (isChanged);
    }
}