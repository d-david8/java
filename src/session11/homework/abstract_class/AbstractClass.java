package session11.homework.abstract_class;

public abstract class AbstractClass {
    AbstractClass() {
        System.out.println("This is the constructor of the abstract class.");
    }

    abstract void a_method();

    void normalMethod() {
        System.out.println("This is a normal method of the abstract class.");
    }
}
