package session11.homework.smart_home_management_system;

public class Light extends Device implements Manageable {

    private int dim;

    public Light(String name) {
        super(name);
        this.dim = 0;
    }

    @Override
    public String getDeviceDetails() {
        return super.getDeviceDetails() + "\n" + "Dim " + dim;
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("The light is on");
    }

    @Override
    public void turnOff() {
        super.turnOff();
        System.out.println("The light was turned off");
    }

    public int getDim() {
        return dim;
    }

    public void setDim(int dim) {
        this.dim = dim;
    }
}
