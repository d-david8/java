package session3.homework;

/*
 * Write a Java program that uses both the increment (++) and decrement (--) operators
 * in a loop to count up to 10 and then back down to 1.
 * */
public class IncrementAndDecrementOperators_1 {

    public static void main(String[] args) {
        int counter = 1;
        boolean countingUp = true;
        while (counter > 0) {
            System.out.print(counter + " ");
            if (counter == 10) {
                countingUp = false;
            }
            if (countingUp) {
                counter++;
            }else {
                counter--;
            }
        }
    }
}
