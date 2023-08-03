package session3.practice;

import java.util.Scanner;

public class ScannerClass {
    //psvm - shortcut
    public static void main(String[] args) {
        //sout -shortcut
        System.out.println();

        String userName = "Maria";
        int age = 34;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please provide some text: ");
        String userInput = scanner.nextLine();
        System.out.println("Your imput is: " + userInput);

        scanner.close();
    }
}
