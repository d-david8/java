package session11.practice.abstraction_practice;

public abstract class Vehicle {

    private double speed;

    protected void setSpeed(double speed) {
        this.speed = speed;
    }

    protected double getSpeed() {
        return speed;
    }

    public abstract void start();

    public final void stop() {
        speed = 0;
    }
}

interface Safety {

    void airbags();

    void antiLockBreaks();
}

class Car extends Vehicle implements Safety {

    @Override
    public void start() {
        System.out.println("Start the engine");
    }

    @Override
    public void airbags() {

    }

    @Override
    public void antiLockBreaks() {

    }
}

class Bicycle extends Vehicle {

    @Override
    public void start() {
        System.out.println("");
    }
}
