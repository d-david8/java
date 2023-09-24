package session5_advancedFlowControl.homework;

import java.util.Scanner;

/*
 * Write a program that prints the first 10 numbers in the Fibonacci series.
 * Use a for loop to accomplish this.
 * */
public class ForLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a number: ");
        int n = scanner.nextInt();
        int fib1 = 1;
        int fib2 = 1;

        System.out.print("The first " + n + " numbers of the Fibonacci series are: ");
        for (int i = 2; i < n + 2; i++) {
            System.out.print(fib1 + " ");
            int fib = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib;
        }
        scanner.close();
    }
}
