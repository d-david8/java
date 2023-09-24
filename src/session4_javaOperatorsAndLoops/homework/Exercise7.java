package session4_javaOperatorsAndLoops.homework;

import java.util.Scanner;

/*
 * 7. Write a Java program that determines the type of a triangle based on its sides.
 * Declare three variables sideOne, sideTwo and sideThree to represent the sides of the
 * triangle. Use the ternary operator to determine and print whether the triangle is
 * "Equilateral", "Isosceles", or "Scalene".
 * */
public class Exercise7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of side one: ");
        float sideOne = scanner.nextFloat();

        System.out.print("Enter the length of side two: ");
        float sideTwo = scanner.nextFloat();

        System.out.print("Enter the length of side three: ");
        double sideThree = scanner.nextFloat();

        String triangleType = (sideOne == sideTwo && sideOne == sideThree)
                ? "Equilateral"
                : (sideOne == sideTwo || sideOne == sideThree || sideTwo == sideThree)
                ? "Isosceles"
                : "Scalene";
        System.out.println("The triangle is " + triangleType);

        scanner.close();
    }
}
