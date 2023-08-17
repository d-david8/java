package codingkata.session2;

public class PrimeNumberFinder {

    public static void main(String[] args) {

        for (long number = 1000000000001L; number < 10000000000000L; number+=2){
            long startTime = System.currentTimeMillis();
            if (isPrime(number)){
                long endTime = System.currentTimeMillis();
                System.out.println(number + " was found in " + (endTime - startTime) + "ms.");
            }
        }
    }

    public static boolean isPrime(long number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
            if (number % divisor == 0){
                return false;
            }
        }
        return true;
    }
}
