package session14.homework.array_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListOperations {

    public static void main(String[] args) {
        List<String> colors = createArrayListWithColors();
//        iterateThroughArrayList(colors);

//        insertElementAtFirstPosition(colors, "Orange");
//        System.out.println(retrieveElementAtIndex(colors, 0));

//        updateElementAtIndex(colors, 3, "Cyan");
//        removeThirdElement(colors);

//        System.out.println(searchElementInArrayList(colors, "Green"));
//        sortArrayList(colors);

//        List<String> newArrayList = copyArrayList(colors);
//        System.out.println(newArrayList);

//        shuffleArrayList(colors);
//        reverseArrayList(colors);

//        System.out.println(extractSubList(colors, 1, 4));
//        System.out.println(compareArrayLists(colors, newArrayList));

//        swapElementsInArrayList(colors, 0, 2);
        System.out.println(colors);
    }

    private static List<String> createArrayListWithColors() {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");
        return colors;
    }

    public static void printArrayList(List<String> arrayList) {
        System.out.println(arrayList);
    }

    public static void iterateThroughArrayList(List<String> arrayList) {
        for (String color : arrayList) {
            System.out.println(color);
        }
    }

    public static void insertElementAtFirstPosition(List<String> arrayList, String element) {
        arrayList.add(0, element);
    }

    public static String retrieveElementAtIndex(List<String> arrayList, int index) {
        if (index < 0 || index > arrayList.size()) {
            System.out.println("Invalid index!");
            return null;
        }
        return arrayList.get(index);
    }

    public static void updateElementAtIndex(List<String> arrayList, int index, String newElement) {
        if (index < 0 || index > arrayList.size()) {
            System.out.println("Invalid index!");
        } else {
            arrayList.set(index, newElement);
        }
    }

    public static void removeThirdElement(List<String> arrayList) {
        if (arrayList.size() < 3) {
            System.out.println("The element does not exist!");
        } else {
            arrayList.remove(2);
        }

    }

    public static boolean searchElementInArrayList(List<String> arrayList, String element) {
        return arrayList.contains(element);
    }

    public static void sortArrayList(List<String> arrayList) {
        Collections.sort(arrayList);
    }

    public static List<String> copyArrayList(List<String> arrayList) {
        return new ArrayList<>(arrayList);
    }

    public static void shuffleArrayList(List<String> arrayList) {
        Collections.shuffle(arrayList);
    }

    public static void reverseArrayList(List<String> arrayList) {
        Collections.reverse(arrayList);
    }
}
