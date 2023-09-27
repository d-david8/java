package codingkata.session8;

import java.util.Scanner;

//Problem statement : https://www.codechef.com/problems/FLOORS
public class Floors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            int xFloor = (x - 1) / 10;
            int yFloor = (y - 1) / 10;

            System.out.println(Math.abs(yFloor - xFloor));
        }
    }
}
