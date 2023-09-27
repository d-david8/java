package session18_recap.practice;

import java.util.Arrays;
import java.util.List;

public class Problem21 {

    //Given the following:
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "cherry", "date");
        long count = items.stream()
                .filter(fruit -> fruit.contains("a"))
                .count();
        System.out.println(count);
    }
}
/*
What is the output?
a) 2
b) 3
c) 4
d) 1
 */