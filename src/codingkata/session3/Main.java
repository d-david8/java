package codingkata.session3;

public class Main {

    public static void main(String[] args) {
        Stack myStak = new Stack();

        System.out.println(myStak.isEmpty());
        System.out.println(myStak.pop());

        myStak.push("first element");
        myStak.push("second element");
        myStak.push("third element");

        System.out.println("Peek: " + myStak.peek());
        System.out.println("Pop: " + myStak.pop());
        System.out.println("Peek: " + myStak.peek());
    }
}
/*
 *
 * second element
 * first element
 * */