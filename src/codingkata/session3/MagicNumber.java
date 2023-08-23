package codingkata.session3;

public class MagicNumber {

    public static void main(String[] args) {
        String myDate = "2002-09-11";

        System.out.println(getMagicNumber(myDate));
    }

    public static int getMagicNumber(String date) {
        int sum = 0;
        for (int i = 0; i < date.length(); i++) {
            char currentChar = date.charAt(i);
            if (Character.isDigit(currentChar)) {
                sum += currentChar - '0';
            }
        }
        if (sum > 9) {
            return getMagicNumber(String.valueOf(sum));
        } else {
            return sum;
        }
    }
}
