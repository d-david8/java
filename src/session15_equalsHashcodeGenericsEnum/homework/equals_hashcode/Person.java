package session15_equalsHashcodeGenericsEnum.homework.equals_hashcode;

import java.util.Objects;

/*
 * Create a Person class with name, age, and email fields. Implement the equals() method to check only
 * the name and age fields. Implement the hashCode() method to use the name and age fields to calculate
 * the hash code. Test that two instances with the same name and age return true for equals() and have
 * the same hash code.
 * */
public class Person {
    private String name;
    private int age;
    private String email;

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person person = (Person) obj;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30, "alice@abc.com");
        Person person2 = new Person("Alice", 30, "alice1@abc.com");

        System.out.println("Are the persons equal? " + person1.equals(person2));
        System.out.println("Hash code for person1: " + person1.hashCode());
        System.out.println("Hash code for person2: " + person2.hashCode());
    }
}
