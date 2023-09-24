package session16_lambdaAndFunctionalInterfaces.practice;

public class StringProcessorTest {

    public static void main(String[] args) {
        StringProcessor removeWhiteSpaces = str -> str.replace(" ", "");
        StringProcessor toUpperCase = str -> str.toUpperCase();

        StringProcessor combined = removeWhiteSpaces.andThe(toUpperCase);
        System.out.println(combined.process("Hello World"));
    }
}
