package session10_inheritanceAndEncapsulation.homework.animal_problem;

public class TestAnimal {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Wolf wolf = new Wolf();

        dog.sound();
        cat.sound();
        wolf.sound();
    }
}
