package session4.homework;

import java.util.Scanner;

/*
 * 6. Write a Java program where you declare an integer variable temperature.
 * Assign a value to it and print "Hot" if the temperature is more than 30,
 * "Warm" if the temperature is between 20 and 30, and "Cold" if it's less than 20.
 * */
public class Exercise6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give the temperature: ");
        float temperature = scanner.nextFloat();

        if (temperature > 30) {
            System.out.println("Hot");
        } else if (temperature < 20) {
            System.out.println("Cold");
        } else {
            System.out.println("Warm");
        }
    }
}
