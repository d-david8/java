package session15.practice.generics;

import java.util.Arrays;
import java.util.List;

public class WildcardPractice {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("John", "Alice");
        List<Integer> integerList = Arrays.asList(1, 2);

        printFirstClass(stringList);
        printFirstClass(integerList);
    }

    private static void printFirstClass(List<?> list) {
        if (!list.isEmpty()) {
            System.out.println(list.get(0).getClass().getSimpleName());
        }
    }
}
