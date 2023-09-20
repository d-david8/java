package session16.homework.lambda_exercises;

import java.util.List;

/*
 * Create a functional interface that is generic and takes a list of generic items and a single generic item,
 * returning a boolean indicating whether the item is in the list. Implement this interface using a
 * lambda expression.
 * */
public class ContainCheckerTest {

    public static void main(String[] args) {
        ContainChecker<String> containsCheckerString = (list, item) -> list.contains(item);
        ContainChecker<Integer> containsCheckerInteger = (list, item) -> list.contains(item);

        List<String> stringList = List.of("one", "two", "three", "four");
        List<Integer> integerList = List.of(1, 2, 3, 4, 5);

        System.out.println(containsCheckerString.contains(stringList, "two"));
        System.out.println(containsCheckerInteger.contains(integerList, 0));
    }
}
