package session15.homework.enums;

/*
 * Extend an enum representing car types to include properties such as average price and manufacturer.
 * Override the toString method to provide a descriptive string representing each enum constant.
 * */
public enum CarType {
    SEDAN("Sedan", "Toyota", 25000),
    SUV("SUV", "Ford", 35000),
    SPORTS("Sports Car", "Ferrari", 200000),
    TRUCK("Truck", "Chevrolet", 40000);

    private final String type;
    private final String manufacturer;
    private final double averagePrice;

    CarType(String type, String manufacturer, double averagePrice) {
        this.type = type;
        this.manufacturer = manufacturer;
        this.averagePrice = averagePrice;
    }

    public String getTypeName() {
        return type;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getAveragePrice() {
        return averagePrice;
    }

    @Override
    public String toString() {
        return "Car Type: " + type + ", Manufacturer: " + manufacturer + ", Average Price: " + averagePrice;
    }

    public static void main(String[] args) {
        for (CarType type : CarType.values()) {
            System.out.println(type);
        }
    }
}

