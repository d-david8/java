package session4.homework;

import java.util.ArrayList;

/*
 * 10. Write a Java program that creates two distinct ArrayList objects, listOne and listTwo.
 * Add some elements to listOne and assign listOne to listTwo. Now modify listOne by adding
 * a new element. Print both lists and observe the output.
 */
public class Exercise10 {

    public static void main(String[] args) {
        ArrayList<String> listOne = new ArrayList<>();
        ArrayList<String> listTwo;

        listOne.add("Elem1");
        listOne.add("Elem2");
        listOne.add("Elem3");

        listTwo = listOne;

        listOne.add("Elem4");

        System.out.println("List One: " + listOne);
        System.out.println("List Two: " + listTwo);
    }
}
