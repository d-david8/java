package session16.homework.lambda_exercises;

import java.util.List;

@FunctionalInterface
public interface NameFormatter {
    List<String> formatNames(List<String> names);
}
