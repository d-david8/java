package session15.homework.generics;

import java.util.Arrays;

/*
 *  Create a generic method to swap the positions of two elements in an array.
 * */
public class GenericArraySwapper {

    public static <T> void swap(T[] array, int index1, int index2) {
        if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) {
            throw new IllegalArgumentException("Invalid indexes");
        }
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};

        System.out.println("Original Array: " + Arrays.toString(intArray));
        swap(intArray, 1, 3);
        System.out.println("Array after swapping: " + Arrays.toString(intArray));
    }
}
