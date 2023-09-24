package session16_lambdaAndFunctionalInterfaces.practice;

@FunctionalInterface
public interface TruncateText {
    String truncate(String input, int maxLength);
}
