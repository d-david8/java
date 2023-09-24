package session16_lambdaAndFunctionalInterfaces.practice;

@FunctionalInterface
public interface ConditionalPrinter {

    void print(String input, boolean condition);
}
