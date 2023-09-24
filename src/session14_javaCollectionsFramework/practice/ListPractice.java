package session14_javaCollectionsFramework.practice;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {

    public static void main(String[] args) {
        List<Integer> myList = initializeList();
        System.out.println(myList);
        List<Integer> updatedList = updateList(myList, 0, 19);
        System.out.println(updatedList);
        System.out.println(myList);


        boolean isValuePresent = searchElement(updatedList, 8);
        System.out.println(isValuePresent);

        List<Integer> evenNumber = filterEvenNumber(myList);
        System.out.println(evenNumber);

        System.out.println("Maximum value from list: " + findMax(evenNumber));
    }

    private static List<Integer> initializeList() {
        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            myList.add(i);
        }
        return myList;
    }

    public static List<Integer> updateList(List<Integer> list, int index, int value) {
        if (index < 0 || index > list.size()) {
            System.out.println("Invalid index");
            return list;
        }
        List<Integer> result = new ArrayList<>(list);
        result.set(index, value);
        result.set(index, value);
        return result;
    }

    public static boolean searchElement(List<Integer> list, int value) {
        return list.contains(value);
    }

    public static List<Integer> filterEvenNumber(List<Integer> list) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int number : list) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }

    public static Integer findMax(List<Integer> list) {
        if (list.isEmpty()) {
            return null;
        }
        int maxValue = list.get(0);
        for (int number : list) {
            if (number > maxValue) {
                maxValue = number;
            }
        }
        return maxValue;
    }
}
