package session17_streamsAndOptional.homework;

import java.util.Arrays;
import java.util.List;

/*
 *Using a stream of strings representing numbers (e.g., "1", "2", "3"), convert them to integers and find the product
 * of all numbers using reduce. (Input: List<String> numbers = Arrays.asList("1", "2", "3", "4", "5");)
 * */
public class ProductOfNumbers {
    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("1", "2", "3", "4", "5");

        int product = numbers.stream()
                .mapToInt(Integer::parseInt)
                .reduce(1, (a, b) -> a * b);
        System.out.println("Product:: " + product);
    }
}
