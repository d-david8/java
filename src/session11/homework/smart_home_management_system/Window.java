package session11.homework.smart_home_management_system;

public class Window extends Device {

    public Window(String name) {
        super(name);
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("The window was locked.");
    }

    @Override
    public void turnOff() {
        super.turnOff();
        System.out.println("The windows was unlocked.");
    }
}
