package session7_utilityClasses.practice;

import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {
        printUserInfo();
    }

    public static void printUserInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String userName = scanner.next();

        System.out.print("Please enter your age: ");
        int userAge = scanner.nextInt();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.printf("User: %s, age %d, student %s", userAge, userAge, isStudent);
    }
}
