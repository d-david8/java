package session16.homework.lambda_exercises;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * Write a program that uses lambda expressions to sort a list of strings in alphabetical order.
 *
 * You are given a List<String> representing a list of words. Create a lambda expression to sort the
 * list in alphabetical order. Next, modify your lambda expression to sort the list in reverse alphabetical order.
 * */
public class ListSort {

    public static void main(String[] args) {

        List<String> myList = Arrays.asList("John", "Bob", "Alice", "David");
        System.out.println(myList
                .stream()
                .sorted()
                .toList()
        );
        Collections.sort(myList, (value1, value2) -> value2.compareTo(value1));
    }
}
