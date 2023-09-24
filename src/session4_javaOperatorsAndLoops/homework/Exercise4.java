package session4_javaOperatorsAndLoops.homework;

/*
 * 4. Write a Java program where you declare two integer variables heightOne and
 * heightTwo with any values. Use a ternary operator to determine the greater height
 * and assign it to a variable maximumHeight. Print the result.
 * */
public class Exercise4 {
    public static void main(String[] args) {
        float heightOne = 123.66f;
        float heightTwo = 143.11f;

        float maximumHeight = heightOne > heightTwo ? heightOne : heightTwo;
        System.out.println("The maximum height is: " + maximumHeight);
    }
}
