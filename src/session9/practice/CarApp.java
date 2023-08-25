package session9.practice;

import java.util.UUID;

public class CarApp {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setBrand("Opel");
        car1.setModel("Astra");
        car1.setSpeed(50);

        System.out.println(car1);
        car1.accelerate();
        car1.accelerate();
        System.out.println(car1);

        UUID uuid = UUID.randomUUID();
        System.out.println(uuid);
    }
}
