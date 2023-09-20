package session16.homework.lambda_exercises;

@FunctionalInterface
interface PairMaker<T, U> {
    Pair<T, U> makePair(T firstElement, U secondElement);
}