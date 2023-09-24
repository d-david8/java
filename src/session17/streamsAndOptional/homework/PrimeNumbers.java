package session17.streamsAndOptional.homework;

import java.util.stream.IntStream;

/*
 * Create a stream of numbers from 1 to 100 and use the filter operation to retain only
 * those numbers which are prime.
 * */
public class PrimeNumbers {

    public static void main(String[] args) {
        IntStream.range(1, 100)
                .filter(PrimeNumbers::isPrime)
                .forEach(System.out::println);
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
