package session10_inheritanceAndEncapsulation.homework.inheritance_types.hierarchical_inheritance;

public class HierarchicalInheritanceMain {

    public static void main(String[] args) {
        System.out.println("Boat object");
        Boat boat = new Boat(30.0, 2000);
        boat.sail();
        System.out.println();

        System.out.println("Speed boat object");
        SpeedBoat speedBoat = new SpeedBoat(25.5, 3000, 60.0, "Outboard");
        speedBoat.sail();
        speedBoat.turboBoost();
        System.out.println();

        System.out.println("Fishing boat object");
        FishingBoat fishingBoat = new FishingBoat(40.0, 5000, 1000, "Drift Net");
        fishingBoat.sail();
        fishingBoat.castNet();
    }
}

