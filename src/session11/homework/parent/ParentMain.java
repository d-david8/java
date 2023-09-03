package session11.homework.parent;

public class ParentMain {

    public static void main(String[] args) {
        FirstSubclass firstSubclass = new FirstSubclass();
        SecondSubclass secondSubclass = new SecondSubclass();

        firstSubclass.message();
        secondSubclass.message();
    }
}