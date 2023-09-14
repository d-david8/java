package session15.practice.generics;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    private T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        Box<String> stringBox = new Box<>();
        stringBox.setObj("Hello!");
        System.out.println(stringBox.getObj());

        Integer[] integers = {1, 2, 3};
        String[] strings = {"Cluj", "Iasi", "Bucuresti"};

        printArray(integers);
        printArray(strings);
    }

    private static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.println(element + " ");
        }
    }
}
