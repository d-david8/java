package session10_inheritanceAndEncapsulation.practice.animal_problem;

public class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("This animal is eating");
    }
}
