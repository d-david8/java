package session3_javaOperators.homework;

/*
 * Write a program where you perform operations between an integer and a double.
 * Display the result and discuss why it is in that format (due to Numeric Promotion).
 * */
public class NumericPromotion_1 {

    public static void main(String[] args) {
        int intValue = 5;
        double doubleValue = 2.5;

        double sum = intValue + doubleValue;
        System.out.println("Sum: " + sum);

        double difference = intValue - doubleValue;
        System.out.println("Difference: " + difference);

        double product = intValue * doubleValue;
        System.out.println("Product: " + product);

        double quotient = intValue / doubleValue;
        System.out.println("Quotient: " + quotient);
    }
}
