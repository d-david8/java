package session18_recap.practice;

import java.util.ArrayList;
import java.util.List;

public class Problem17 {

    //Consider the following:
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.remove(0);
        System.out.println(fruits.get(0));
    }
}
/*
What is the output?
a) Apple
b) Banana
c) An IndexOutOfBoundsException
d) null
 */
