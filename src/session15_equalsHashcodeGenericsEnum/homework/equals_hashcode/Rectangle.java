package session15_equalsHashcodeGenericsEnum.homework.equals_hashcode;

import java.util.Objects;

/*
 * Implement the equals() and hashCode() methods for a Rectangle class with width and height fields.
 * Test that two instances with the same width and height return true for equals() and have the
 * same hash code.
 * */
public class Rectangle {
    private long width;
    private long height;

    public Rectangle(long width, long height) {
        this.width = width;
        this.height = height;
    }

    // Override the equals() method to compare rectangles by width and height.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Rectangle rectangle = (Rectangle) obj;
        return width == rectangle.width && height == rectangle.height;
    }

    // Override the hashCode() method to generate a hash code based on width and height.
    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(5, 10);
        Rectangle rectangle2 = new Rectangle(5, 10);

        System.out.println("Are the rectangles equal? " + rectangle1.equals(rectangle2));
        System.out.println("Hash code for rectangle1: " + rectangle1.hashCode());
        System.out.println("Hash code for rectangle2: " + rectangle2.hashCode());
    }
}