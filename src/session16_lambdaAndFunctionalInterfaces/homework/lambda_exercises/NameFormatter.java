package session16_lambdaAndFunctionalInterfaces.homework.lambda_exercises;

import java.util.List;

@FunctionalInterface
public interface NameFormatter {
    List<String> formatNames(List<String> names);
}
