package session16.homework.lambda_exercises;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/*
 * Create a functional interface that takes a list of integers and returns the maximum value from the list.
 * Implement this interface using a lambda expression. Ensure your lambda correctly handles an empty list case.
 * */
public class TestMaxFromList {

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1, 22, 3, 4, 5, 6, 7, 8);
        MaxFromList maxFromList = integerList -> {
            if (integerList.isEmpty()) return null;
            int max = integerList.get(0);
            for (Integer elem : integerList) {
                max = Math.max(max, elem);
            }
            return max;
        };
        System.out.println(maxFromList.getMax(myList));

        AtomicReference<Integer> max2 = new AtomicReference<>(Integer.MIN_VALUE);
        MaxFromList maxFromList2 = integerList -> {
            integerList.forEach(integer -> max2.set(Math.max(integer, max2.get())));
            return null;
        };
        maxFromList2.getMax(myList);
        System.out.println(max2);
    }
}
