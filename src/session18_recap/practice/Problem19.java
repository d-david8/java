package session18_recap.practice;

import java.util.HashSet;
import java.util.Set;

public class Problem19 {

    //Given the following:
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        System.out.println(numbers.size());
    }
}
/*
What will be the output?
a) 3
b) 4
c) 2
d) 1
 */