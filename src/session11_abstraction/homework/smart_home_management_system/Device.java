package session11_abstraction.homework.smart_home_management_system;

public class Device implements Manageable {
    private String name;

    private boolean isOn;

    public Device(String name) {
        this.name = name;
        isOn = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeviceDetails() {
        return "Device: " + this.name + "\n" +
                "Is on: " + this.isOn;
    }

    @Override
    public void turnOn() {
        this.isOn = true;
    }

    @Override
    public void turnOff() {
        this.isOn = false;
    }
}