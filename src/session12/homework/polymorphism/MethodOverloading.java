package session12.homework.polymorphism;

public class MethodOverloading {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 2));
        System.out.println(sum(1.2, 4.6));
        System.out.println(sum(1, 2, 3));
    }
}
