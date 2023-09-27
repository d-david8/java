package codingkata.session8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Problem statement : https://www.codechef.com/COOK110B/problems/MATCHES
public class Matches {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> value = new HashMap<>();

        value.put(0, 6);
        value.put(1, 2);
        value.put(2, 5);
        value.put(3, 5);
        value.put(4, 4);
        value.put(5, 5);
        value.put(6, 6);
        value.put(7, 3);
        value.put(8, 7);
        value.put(9, 6);

        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int sum = a + b;
            int count = 0;
            while (sum > 0) {
                count += value.get(sum % 10);
                sum = sum / 10;
            }

            System.out.println(count);
        }
    }
}
