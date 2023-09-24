package session16_lambdaAndFunctionalInterfaces.homework.lambda_exercises;

/*
 * Create a functional interface called PairMaker which takes two parameters of type T and U and returns
 * a Pair object that holds both values. The Pair class should be a generic class that can hold two
 * values of any types. Your task is to implement the PairMaker using a lambda expression to instantiate
 * Pair objects with the given values.
 * */
public class PairMakerTest {

    public static void main(String[] args) {
        PairMaker<Integer,String> pairMaker = (anInteger, aString) -> new Pair<>(anInteger,aString);
        System.out.println(pairMaker.makePair(2,"Alice"));
    }
}
