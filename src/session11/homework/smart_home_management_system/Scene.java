package session11.homework.smart_home_management_system;

import java.util.ArrayList;
import java.util.List;

public class Scene {
    private String name;
    private List<Device> devices;

    public Scene(String name) {
        this.name = name;
        this.devices = new ArrayList<>();
    }

    public void addDevice(Device device) {
        devices.add(device);
    }

    public void activate() {
        System.out.println("Activating scene: " + name);
        for (Device device : devices) {
            device.turnOn();
        }
    }

    public void deactivate() {
        System.out.println("Deactivating scene: " + name);
        for (Device device : devices) {
            device.turnOff();
        }
    }

    public String getName() {
        return name;
    }
}
