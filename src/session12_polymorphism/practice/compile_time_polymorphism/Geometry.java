package session12_polymorphism.practice.compile_time_polymorphism;

public class Geometry {

    //method overloading
    // calculate area of a circle
    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    //calculate area of a triangle
    public double area(double base, double height) {
        return (base * height) / 2;
    }

}
