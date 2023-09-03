package session10.homework.inheritance_types.hierarchical_inheritance;

public class Boat {
    protected double length;
    protected double weight;

    public Boat(double length, double weight) {
        this.length = length;
        this.weight = weight;
    }

    public void sail() {
        System.out.println("The boat is sailing");
    }
}
