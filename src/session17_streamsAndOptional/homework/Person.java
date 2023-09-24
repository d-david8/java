package session17_streamsAndOptional.homework;

import java.util.Arrays;
import java.util.List;

/*
 * Given a list of people with attributes: first name, last name, and age;
 * use streams to find all people who are older than 18 years.
 * class Person {
 *    String firstName;
 *    String lastName;
 *    int age;
 * }
 * List<Person> people = Arrays.asList(new Person("Alice", "Johnson", 20), new Person("Bob", "Smith", 17));
 * */
public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " age: " + age;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", "Johnson", 20),
                new Person("Bob", "Smith", 17));
        people.stream()
                .filter(person -> person.getAge() >= 18)
                .forEach(System.out::println);
    }
}
