package session16_lambdaAndFunctionalInterfaces.practice;

@FunctionalInterface
public interface StringProcessor {
    String process(String input);

    default StringProcessor andThe(StringProcessor after) {
        return input -> after.process(this.process(input));
    }
}
