package session16_lambdaAndFunctionalInterfaces.homework.lambda_exercises;

import java.util.List;

@FunctionalInterface
public interface ContainChecker<E> {
    boolean contains(List<E> list, E elem);
}
