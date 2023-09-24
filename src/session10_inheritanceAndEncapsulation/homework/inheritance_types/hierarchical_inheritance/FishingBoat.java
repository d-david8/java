package session10_inheritanceAndEncapsulation.homework.inheritance_types.hierarchical_inheritance;

public class FishingBoat extends Boat {
    private int fishCapacity;
    private String typeOfNet;

    public FishingBoat(double length, double weight, int fishCapacity, String typeOfNet) {
        super(length, weight);
        this.fishCapacity = fishCapacity;
        this.typeOfNet = typeOfNet;
    }

    public void castNet() {
        System.out.println("Cast net enabled");
    }
}
