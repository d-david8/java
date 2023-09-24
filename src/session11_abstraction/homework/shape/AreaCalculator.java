package session11_abstraction.homework.shape;

public class AreaCalculator {

    public static void main(String[] args) {
        Area areaCalculator = new Area();

        double rectangleArea = areaCalculator.RectangleArea(5.0, 8.0);
        double squareArea = areaCalculator.SquareArea(6.0);
        double circleArea = areaCalculator.CircleArea(4.0);

        System.out.println("Rectangle Area: " + rectangleArea);
        System.out.println("Square Area: " + squareArea);
        System.out.println("Circle Area: " + circleArea);
    }
}
