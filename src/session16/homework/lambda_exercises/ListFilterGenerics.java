package session16.homework.lambda_exercises;

import java.util.List;
import java.util.function.Predicate;

@FunctionalInterface
public interface ListFilterGenerics<T> {
    List<T> filter(List<T> list, Predicate<T> predicate);
}
