package session8_arrayListVsLinkedListAndWrappers.practice;

public class BinarySearchExample {

    public static void main(String[] args) {
        int[] myArray = {1, 3, 5, 13, 17, 20};
        //               0  1  2  3   4  5
        int target = 22;
        int result = binarySearch(myArray, target);
        if (result != -1) {
            System.out.println("Target found: " + target + " at position " + result);
        } else {
            System.out.println("Target not found: " + target);
        }
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int rightSide = array.length - 1;
        while (left <= rightSide) {
            int middle = left + (rightSide - left) / 2;
            System.out.println(middle);
            if (array[middle] == target) {
                return middle;
            } else if (array[middle] < target) {
                left = middle + 1;
            } else {
                rightSide = middle - 1;
            }
        }
        return -1;
    }
}