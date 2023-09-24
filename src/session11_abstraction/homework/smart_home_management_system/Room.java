package session11_abstraction.homework.smart_home_management_system;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private String name;
    private List<Device> devices;

    public Room(String name) {
        this.name = name;
        this.devices = new ArrayList<>();
    }

    public void addDevice(Device device) {
        devices.add(device);
    }

    public void removeDevice(Device device) {
        devices.remove(devices);
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void printDevices() {
        System.out.println("Devices in " + this.name + ":");
        for (Device device : devices) {
            System.out.println("- " + device.getName());
        }
    }
}
