package session3.homework;

/*
 * Create a program that takes two byte values, adds them together, and stores the result
 * in a byte variable. Explain why the result is or is not what you'd expect, based on
 * the rules of numeric promotion.
 * */
public class NumericPromotion_2 {

    public static void main(String[] args) {
        byte a = 100;
        byte b = 50;

        byte result = (byte) (a + b);
        System.out.println("Result: " + result);
    }
}
