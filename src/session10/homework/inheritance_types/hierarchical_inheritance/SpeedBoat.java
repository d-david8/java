package session10.homework.inheritance_types.hierarchical_inheritance;

public class SpeedBoat extends Boat {
    private double maxSpeed;
    private String engineType;

    public SpeedBoat(double length, double weight, double maxSpeed, String engineType) {
        super(length, weight);
        this.maxSpeed = maxSpeed;
        this.engineType = engineType;
    }

    public void turboBoost() {
        System.out.println("Turbo boost enabled");
    }

}
