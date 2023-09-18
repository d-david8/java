package session16.practice;

public class TestConditionalPrinter {

    public static void main(String[] args) {
        ConditionalPrinter conditionalPrinter = ((String input, boolean condition) -> {
            if (condition)
                System.out.println(input);
        });

        conditionalPrinter.print("Hello John", true);
        conditionalPrinter.print("Hello Alica", false);
    }
}
