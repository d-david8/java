package session7_utilityClasses.practice;

import java.util.Random;

public class RandomPractice {

    public static void main(String[] args) {
        printRandomNumbers(1, 500);
    }

    public static void printRandomNumbers(int startInterval, int endInterval) {
        Random random = new Random();

        for (int index = 0; index < 100; index++) {
            System.out.println(random.nextInt(startInterval, endInterval));
        }
    }
}
