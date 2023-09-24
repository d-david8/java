package session16_lambdaAndFunctionalInterfaces.homework.lambda_exercises;

import java.util.List;

@FunctionalInterface
public interface MaxFromList {
    Integer getMax(List<Integer> list);
}
