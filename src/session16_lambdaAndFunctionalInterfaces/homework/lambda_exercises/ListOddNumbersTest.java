package session16_lambdaAndFunctionalInterfaces.homework.lambda_exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Create a functional interface that takes a list of integers and returns a list of integers.
 * Use a lambda expression to implement this interface, such that it returns a list containing
 * only the odd numbers from the original list.
 * */
public class ListOddNumbersTest {

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        ListOddNumbers listOddNumbers = list -> {
            List<Integer> newList = new ArrayList<>();
            for (Integer elem : list) {
                if (elem % 2 == 0) {
                    newList.add(elem);
                }
            }
            return newList;
        };
        List<Integer> newList = listOddNumbers.getOddsNumber(myList);
        System.out.println(newList);
    }
}
