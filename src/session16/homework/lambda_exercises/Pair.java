package session16.homework.lambda_exercises;

public class Pair<T, U> {
    private T firstElement;
    private U secondElement;

    public Pair(T first, U second) {
        this.firstElement = first;
        this.secondElement = second;
    }

    public T getFirstElement() {
        return firstElement;
    }

    public U getSecondElement() {
        return secondElement;
    }

    @Override
    public String toString() {
        return "Pair: (" + firstElement + " , " + secondElement+")";
    }
}
