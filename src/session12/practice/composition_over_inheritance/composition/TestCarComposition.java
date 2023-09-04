package session12.practice.composition_over_inheritance.composition;

public class TestCarComposition {

    public static void main(String[] args) {
        Engine carEngine = new Engine();
        Car car = new Car(carEngine);
        car.start();
    }
}
