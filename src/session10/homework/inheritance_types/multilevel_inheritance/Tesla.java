package session10.homework.inheritance_types.multilevel_inheritance;

public class Tesla extends ElectricCar {
    private String autopilotVersion;

    public Tesla(String make, String model, int year, int batteryCapacity, int range, String autopilotVersion) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.batteryCapacity = batteryCapacity;
        this.range = range;
        this.autopilotVersion = autopilotVersion;
    }

    public void enableAutopilot() {
        System.out.println("Autopilot enabled, version: " + autopilotVersion);
    }
}
