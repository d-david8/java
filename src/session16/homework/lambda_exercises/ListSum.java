package session16.homework.lambda_exercises;


import session16.practice.IntSum;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/*
 * Write a program that uses lambda expressions to calculate the sum of all the elements in a list of integers.
 * */
public class ListSum {
    public static void main(String[] args) {


        List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        IntSum add = Integer::sum;

        AtomicInteger sum = new AtomicInteger();
        myList.forEach(elem -> sum.addAndGet(elem));

        System.out.println(sum.get());

    }
}
