package session12_polymorphism.practice.virtual_methods;

public class FruitTest {

    public static void main(String[] args) {
        printFruiDetails(new Apple());
        printFruiDetails(new Orange());
    }

    public static void printFruiDetails(Fruit fruit) {
        System.out.println("Taste: " + fruit.taste());
        System.out.println("Colour: " + fruit.colour());
    }
}
