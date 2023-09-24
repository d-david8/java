package session11_abstraction.homework.smart_home_management_system;

public class Door extends Device {

    public Door(String name) {
        super(name);
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("The door was locked.");
    }

    @Override
    public void turnOff() {
        super.turnOff();
        System.out.println("The door was unlocked.");
    }
}
