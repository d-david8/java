package session5.homework;

import java.util.Scanner;

/*
 * Write a program that generates and prints the first n numbers of the
 * Fibonacci series, where n is provided by the user.
 * */
public class FibonacciSeriesGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a number: ");
        int n = scanner.nextInt();

        int fib1 = 1;
        int fib2 = 1;

        System.out.print("The first " + n + " numbers of the Fibonacci series are: ");
        while(n-- > 0) {
            System.out.print(fib1 + " ");
            int fib = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib;
        }
        scanner.close();
    }
}
