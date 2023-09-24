package session16_lambdaAndFunctionalInterfaces.homework.lambda_exercises;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MappingListTest {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Function<Integer, Integer> negativeNumber = number -> -number;
        MappingList listMapper = (list, mapper) -> list.replaceAll(mapper::apply);

        listMapper.map(numbers, negativeNumber);
        System.out.println(numbers);
    }
}
