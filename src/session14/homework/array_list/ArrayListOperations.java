package session14.homework.array_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListOperations {

    public static void main(String[] args) {
        List<String> colors = createArrayListWithColors();
        iterateThroughArrayList(colors);

        insertElementAtFirstPosition(colors, "Orange");
        System.out.println(retrieveElementAtIndex(colors, 0));

        updateElementAtIndex(colors, 3, "Cyan");
        removeThirdElement(colors);

        System.out.println(searchElementInArrayList(colors, "Green"));
        sortArrayList(colors);

        List<String> newArrayList = copyArrayList(colors);
        System.out.println(newArrayList);

        shuffleArrayList(colors);
        reverseArrayList(colors);

        System.out.println(getSubList(colors, 1, 3));
        List<String> secondLis = new ArrayList<>(colors);
        System.out.println(areEquals(colors, secondLis));

        swapElements(colors, 3, 1);
        System.out.println(joinArrayLists(colors, secondLis));

        System.out.println(cloneArrayList(colors));
        emptyArrayList(colors);
        System.out.println(isArrayListEmpty(colors));
        printArrayList(colors);
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

    public static List<String> getSubList(List<String> list, int startIndex, int endIndex) {
        if (startIndex < 0 || endIndex > list.size() || startIndex > endIndex) {
            System.out.println("invalid indexes");
            return new ArrayList<>();
        }
        return new ArrayList<>(list.subList(startIndex, endIndex));
    }

    public static boolean areEquals(List<String> firstList, List<String> seconList) {
        return firstList.equals(seconList);
    }

    public static void swapElements(List<String> list, int index1, int index2) {
        if (index1 < 0 || index1 >= list.size() || index2 < 0 || index2 >= list.size()) {
            System.out.println("Invalid indexes.");
        } else {
            Collections.swap(list, index1, index2);
        }
    }

    public static List<String> joinArrayLists(List<String> list1, List<String> list2) {
        List<String> joinedList = new ArrayList<>(list1);
        joinedList.addAll(list2);
        return joinedList;
    }

    public static List<String> cloneArrayList(List<String> originalList) {
        return new ArrayList<>(originalList);
    }

    public static void emptyArrayList(List<String> list) {
        list.clear();
    }

    public static boolean isArrayListEmpty(List<String> list) {
        return list.isEmpty();
    }
}
