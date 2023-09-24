package session10_inheritanceAndEncapsulation.homework.inheritance_types.multilevel_inheritance;

public class ElectricCar extends Car {
    protected int batteryCapacity;
    protected int range;

    public void charge() {
        System.out.println("Charging the electric car");
    }
}