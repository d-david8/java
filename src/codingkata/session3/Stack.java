package codingkata.session3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Stack {
    private List<String> stack;

    public Stack() {
        stack = new LinkedList<>();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public String peek() {
        if (stack.isEmpty()) {
            return null;
        } else {
            return stack.get(0);
        }
    }

    public String pop() {
        if (stack.isEmpty()) {
            return null;
        } else {
            return stack.remove(0);
        }
    }

    public void push(String obj) {
        stack.add(0, obj);
    }
}
