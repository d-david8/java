package codingkata.session7;

public class FindTheMissingNumber {

    public static void main(String[] args) {
        int sum = 0;
        int[] numbers = {3, 0, 1, 5, 2};
        double expectedSum = (double) (numbers.length * (numbers.length + 1)) / 2;

        for (int num : numbers) {
            sum += num;
        }
        double missingNumber = expectedSum - sum;
        System.out.println(missingNumber);
    }
}
