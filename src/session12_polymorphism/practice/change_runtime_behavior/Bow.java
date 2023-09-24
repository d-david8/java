package session12_polymorphism.practice.change_runtime_behavior;

public class Bow implements Weapon{
    @Override
    public void use() {
        System.out.println("Using bow");
    }
}
