package session10.practice;

public class Quadruped {

    private String name;

    public Quadruped(String name) {
        this.name = name;
        System.out.println("Constructor from Animal class was called");
    }
}

class Dog extends Quadruped {

    public Dog(String name) {
        super(name);
        System.out.println("Constructor from Dog class was called");
    }
}
