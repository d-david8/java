package session12_polymorphism.practice.virtual_methods;

public class Orange extends Fruit {
    @Override
    public String taste() {
        return "orange is sour";
    }

    @Override
    public String colour() {
        return "orange is orange";
    }
}
