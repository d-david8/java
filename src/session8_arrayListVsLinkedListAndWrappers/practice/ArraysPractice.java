package session8_arrayListVsLinkedListAndWrappers.practice;

import java.util.Arrays;

public class ArraysPractice {

    public static void main(String[] args) {
        int[] numbers = {1, 5, 3, 2, 10};
        //               0  1  2  3  4
        //ctrl + alt + M -> extract code to a new method
        printArrayAvrage(numbers);

        String[][] names = {{"Ms", "Mr"}, {"Maria", "John"}};
        printMultidimensionalArray(names);

        System.out.println("Sorted arrays");
        printIntSortedArray(numbers);
        printStringSortedArray(names[1]);

        printStringSearchResult(names[1], "Joch");
        printIntSearchResult(numbers, 2);
    }

    public static void printArrayAvrage(int[] numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
            //System.out.print(number + " ");
        }
        System.out.println(numbers[1]);

        int averageResult = sum / numbers.length;

        System.out.println("Arrays length: " + numbers.length);
        System.out.println("Arrays sum: " + sum);
        System.out.println("Arrays average: " + averageResult);
    }

    public static void printMultidimensionalArray(String[][] names) {
        //System.out.println(names[0][1] + " " + names[1][1]);

        for (int index = 0; index < names.length; index++) {
            for (int index2 = 0; index2 < names[index].length; index2++) {
                System.out.print(names[index2][index] + " ");
            }
            System.out.println();
        }
    }

    public static void printStringSortedArray(String[] arrayInput) {
        Arrays.sort(arrayInput);

        for (String input : arrayInput) {
            System.out.print(input + " ");
        }
    }

    public static void printIntSortedArray(int[] arrayInput) {
        Arrays.sort(arrayInput);

        for (int input : arrayInput) {
            System.out.print(input + " ");
        }
    }

    public static void printStringSearchResult(String[] arrayInput, String searchKey) {
        Arrays.sort(arrayInput);
        System.out.println("\nSearch Result: " + Arrays.binarySearch(arrayInput, searchKey));
    }

    public static void printIntSearchResult(int[] arrayInput, int searchKey) {
        Arrays.sort(arrayInput);
        System.out.println("\nSearch Result: " + Arrays.binarySearch(arrayInput, searchKey));
    }
}