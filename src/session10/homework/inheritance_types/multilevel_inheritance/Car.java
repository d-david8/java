package session10.homework.inheritance_types.multilevel_inheritance;

public class Car {
    protected String make;
    protected String model;
    protected int year;

    public void start() {
        System.out.println("Car started");
    }

    public void stop() {
        System.out.println("Car stopped");
    }

    public void accelerate() {
        System.out.println("Car accelerating");
    }
}
