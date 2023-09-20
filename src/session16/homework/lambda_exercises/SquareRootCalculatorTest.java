package session16.homework.lambda_exercises;

public class SquareRootCalculatorTest {
    public static void main(String[] args) {
        SquareRootCalculator calculator = value -> Math.sqrt(value);

        System.out.println(calculator.squareRoot(49));
        System.out.println(calculator.squareRoot(43));
    }
}
