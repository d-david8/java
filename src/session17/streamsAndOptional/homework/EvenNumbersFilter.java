package session17.streamsAndOptional.homework;

import java.util.List;

/*
 * Given a list of integers, create a new list that contains only the even numbers.
 * Use streams to achieve this. (Input: List<Integer> numbers = Arrays.asList(3, 4, 7, 8, 12, 15);)
 * */
public class EvenNumbersFilter {

    public static void main(String[] args) {
        List<Integer> myList = List.of(1, 2, 3, 4, 5, 6, 7);
        List<Integer> evenNumbers = myList.stream()
                .filter(number -> number % 2 == 0)
                .toList();
        System.out.println(evenNumbers);
    }
}
