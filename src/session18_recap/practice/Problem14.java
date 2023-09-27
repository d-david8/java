package session18_recap.practice;

public class Problem14 {
}
class Vehicle {
    String type;
    Vehicle() {
        this("Car");
    }
    Vehicle(String type) {
        this.type = type;
    }
}
class Car extends Vehicle {
    Car() {
        super("Sports Car");
    }
}
/*
If an instance of Car is created, what will be the value of type?
a) "Car"
b) "Sports Car"
c) null
d) "Vehicle"
 */