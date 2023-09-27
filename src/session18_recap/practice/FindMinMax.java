package session18_recap.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
 * Problem 3
 * Given a list of random numbers, use Java streams to find the smallest and largest numbers in the list.
 * Do not use the traditional loop-based method for this.
 * */
public class FindMinMax {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(100, 21, 34, 64, 5, 86, 7, 8, 9, 10);

        System.out.println("Maximum value: " + max(numbers));
        System.out.println("Minimum value: " + min(numbers));

    }

    private static int min(List<Integer> list) {
        Optional<Integer> minvalue = list.stream()
                .min(Integer::compareTo);
        return minvalue.orElse(0);
    }

    private static int max(List<Integer> list) {
        Optional<Integer> maxvalue = list.stream()
                .max(Integer::compareTo);
        return maxvalue.orElse(0);
    }

}
