package codingkata.session1;

public class StringManipulation {

    public static void main(String[] args) {

        System.out.println(getStringLength("test"));
        System.out.println(getStringReversed("abc"));
    }

    public static int getStringLength(String input) {
        int count = 0;

        for (char character : input.toCharArray()){
            count++;
        }
        return count;
    }
    public static String getStringReversed(String input){
        return new StringBuilder(input).reverse().toString();
    }
}
