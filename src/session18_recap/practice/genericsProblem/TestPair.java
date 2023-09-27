package session18_recap.practice.genericsProblem;

import java.util.ArrayList;

public class TestPair {

    public static void main(String[] args) {
        Pair<StringBuilder, ArrayList> pair = new Pair<>(new StringBuilder("a"), new ArrayList<>());
        pair.getKey().append("b");
        pair.getValue().add("something");
        System.out.println(pair);
    }
}