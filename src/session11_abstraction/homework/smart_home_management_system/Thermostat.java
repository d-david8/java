package session11_abstraction.homework.smart_home_management_system;

public class Thermostat extends Device implements Manageable {

    private int temperature;

    public Thermostat(String name) {
        super(name);
        this.temperature = 20;
    }

    @Override
    public String getDeviceDetails() {
        return super.getDeviceDetails() + "\n" +
                "Temperature: " + this.temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("The thermostat is on");
    }

    @Override
    public void turnOff() {
        super.turnOff();
        System.out.println("The thermostat was turned off");
    }

    public void adjustTemperature(int degrees) {
        temperature += degrees;
    }
}
