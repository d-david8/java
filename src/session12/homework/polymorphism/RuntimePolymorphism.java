package session12.homework.polymorphism;

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Parent parent;

        parent = new Child1();
        parent.print();
        System.out.println(parent.value);

        parent = new Child2();
        parent.print();
        System.out.println(parent.value);
    }
}

class Parent {

    int value = 0;

    void print() {
        System.out.println("Parent class");
    }
}

class Child1 extends Parent {
    int value = 100;

    void print() {
        System.out.println("Child1 class");
    }
}

class Child2 extends Parent {
    int value = 200;

    void print() {
        System.out.println("Child2 class");
    }
}
