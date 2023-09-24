package session16_lambdaAndFunctionalInterfaces.homework.lambda_exercises;

import java.util.Arrays;
import java.util.List;

/*
 * Write a program that uses lambda expressions to filter a list of integers and return only the even numbers.
 * */

public class ListFilter {

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println(myList
                .stream()
                .filter(num -> num % 2 == 0)
                .toList());
    }
}
