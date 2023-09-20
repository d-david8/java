package session16.homework.lambda_exercises;

import java.util.List;
import java.util.function.Function;

@FunctionalInterface
public interface MappingList {

    void map(List<Integer> list, Function<Integer, Integer> mapper);
}
