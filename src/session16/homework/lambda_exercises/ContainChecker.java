package session16.homework.lambda_exercises;

import java.util.List;

@FunctionalInterface
public interface ContainChecker<E> {
    boolean contains(List<E> list, E elem);
}
