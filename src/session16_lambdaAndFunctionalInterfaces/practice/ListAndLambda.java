package session16_lambdaAndFunctionalInterfaces.practice;

import java.util.Arrays;
import java.util.List;

public class ListAndLambda {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Bob");
        //for enhanced loop
        for (String name : names) {
            System.out.println(name);
        }
        //lambda
        names.forEach(name -> System.out.println(name));

        //stream
        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(name -> System.out.println(name));
    }
}
