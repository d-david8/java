package session16_lambdaAndFunctionalInterfaces.homework.lambda_exercises;

import java.util.List;

@FunctionalInterface
public interface ListOddNumbers {
    List<Integer> getOddsNumber(List<Integer> list);
}
