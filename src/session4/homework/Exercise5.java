package session4.homework;

/*
 * 5. Write a Java program to print the numbers from 1 to 10 using a for loop.
 * As a next step, modify your program to print only the even numbers from 1 to 10.
 * */
public class Exercise5 {
    public static void main(String[] args) {

        System.out.println("Numbers from 1 to 10:");
        for (int i = 1; i < 11; i++)
            System.out.print(i + " ");

        System.out.println("\nEven numbers from 1 to 10");
        for (int i = 2; i < 11; i += 2)
            System.out.print(i + " ");

        System.out.println("\nEven number form 1 to 10 using modulus");
        for (int i = 1; i < 11; i++)
            if (i % 2 == 0)
                System.out.print(i + " ");
    }
}
