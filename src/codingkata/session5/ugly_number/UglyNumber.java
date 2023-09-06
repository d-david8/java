package codingkata.session5.ugly_number;

import java.util.Random;

public class UglyNumber {

    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            int number = random.nextInt(20);
            System.out.println("The number " + number + (checkIsUgly(number) ? " is ugly" : " is not ugly "));
        }
    }

    public static boolean checkIsUgly(int number) {
        if (!isNumberValid(number)) {
            return false;
        }
        for (int divisor = 6; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        if (number % 4 == 0) {
            return false;
        }
        return isDivisibleBy(number);
    }

    public static boolean isNumberValid(int number) {
        return number >= 0;
    }

    public static boolean isDivisibleBy(int number) {
        return number % 2 == 0 || number % 3 == 0 || number % 5 == 0;
    }
}
