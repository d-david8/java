package session4.homework;

/*
 * 9. Write a Java program to create two String variables, countryOne with the value
 * "USA" and countryTwo with the value "USA". Check if countryOne and countryTwo are
 * equal using the equals() method and print the result. Then change the value of countryTwo
 * to "UK" and check for equality again. Print the result.
 */
public class Exercise9 {

    public static void main(String[] args) {
        String countryOne = "USA";
        String countryTwo = "USA";

        System.out.println("Before: " + countryOne.equals(countryTwo));

        countryTwo = "UK";
        System.out.println("After assigning UK to the second variable: " + countryOne.equals(countryTwo));
    }
}
