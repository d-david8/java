package session16_lambdaAndFunctionalInterfaces.practice;

@FunctionalInterface
public interface Calculator {
    double calculate(double a, double b, char operator);
}
