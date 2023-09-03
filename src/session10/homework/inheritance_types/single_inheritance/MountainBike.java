package session10.homework.inheritance_types.single_inheritance;

public class MountainBike extends Bicycle {
    private String tireType;
    private String suspension;

    public String getTireType() {
        return tireType;
    }

    public void setTireType(String tireType) {
        this.tireType = tireType;
    }

    public void adjustSuspension(String newSuspension) {
        suspension = newSuspension;
        System.out.println("Adjusted suspension to: " + suspension);
    }
}