package session16_lambdaAndFunctionalInterfaces.homework.lambda_exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
 *Create a functional interface named ListFilter that works with generics. It should have a method that
 * takes a list of elements of type T and a predicate functional interface, applying the predicate to
 * filter elements of the list, returning a new list with elements that satisfy the predicate condition.
 * Implement the ListFilter using a lambda expression and demonstrate its usage with different types of
 * lists and predicates.
 * */
public class ListFilterGenericsTest {

    public static void main(String[] args) {

        Predicate<Object> integerFilter = integerNumber -> (Integer) integerNumber % 2 == 0;
        Predicate<Object> stringFilter = string -> ((String)string).startsWith("A");

        ListFilterGenerics<Object> filterGenerics = (list, predicate) -> {
            List<Object> filteredList = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                if (predicate.test(list.get(i))) {
                    filteredList.add(list.get(i));
                }
            }
            return filteredList;
        };
        List<Object> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Object> filteredIntegerList = filterGenerics.filter(integerList, integerFilter);
        System.out.println(filteredIntegerList);

        List<Object> stringList = List.of("Alice", "John", "Anna", "David", "Bob");
        System.out.println(filterGenerics.filter(stringList, stringFilter));

    }


}
