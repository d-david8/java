package session4_javaOperatorsAndLoops.homework;

/*
 * 1. Write a Java program where you create two String objects named stringOne
 * and stringTwo with the same value "OpenAI". Check and print whether they refer
 * to the same object.
 * */
public class Exercise1 {

    public static void main(String[] args) {
        String stringOne = "OpenAI";
        String stringTwo = "OpenAI";

        System.out.println("Using == the resul is: " + (stringOne == stringTwo));
        System.out.println("Using .equals() te resul is: " + stringOne.equals(stringTwo));
    }
}
