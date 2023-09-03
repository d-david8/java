package session10.homework.inheritance_types.single_inheritance;

public class Bicycle {
    protected int speed;
    protected int gear;

    public void changeGear(int newGear) {
        gear = newGear;
        System.out.println("Gear changed to " + gear);
    }

    public void speedUp(int increment) {
        speed += increment;
        System.out.println("Speeding up. Current speed: " + speed);
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
        System.out.println("Applying brake. Current speed: " + speed);
    }
}
