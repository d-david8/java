package session16.practice;

public class LambdaPractice {

    public static void main(String[] args) {
        IntSum getSum = (a, b) -> a + b;
        System.out.println(getSum.sum(3, 8));

        IntMultiply getMultiply = (a, b) -> a * b;
        System.out.println(getMultiply.multiply(3, 4));
    }
}
