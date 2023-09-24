package session12_polymorphism.homework.polymorphism;

public class InheritanceEx {

    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        sparrow.fly();
        sparrow.sing();
    }
}

class Bird {
    void fly() {
        System.out.println("Bird can fly");
    }
}

class Sparrow extends Bird {
    void sing() {
        System.out.println("Sparrow can sing");
    }
}
