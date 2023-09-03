package session10.homework.inheritance_types.single_inheritance;

public class SingleInheritanceMain {

    public static void main(String[] args) {

        System.out.println("Bicycle object");
        Bicycle bicycle = new Bicycle();
        bicycle.changeGear(3);
        bicycle.speedUp(10);
        bicycle.applyBrake(5);
        System.out.println();

        System.out.println("MountainBike object");
        MountainBike mountainBike = new MountainBike();
        mountainBike.changeGear(2);
        mountainBike.speedUp(15);
        mountainBike.applyBrake(7);
        mountainBike.adjustSuspension("High");
        mountainBike.setTireType("Summer");
        System.out.println("Tire type: " + mountainBike.getTireType());
    }
}