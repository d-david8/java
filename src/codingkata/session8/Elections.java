package codingkata.session8;

import java.util.Scanner;

//Problem statement: https://www.codechef.com/problems/ELECTIONS?tab=statement
public class Elections {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int[] array = new int[3];
            array[0] = sc.nextInt();
            array[1] = sc.nextInt();
            array[2] = sc.nextInt();

            String[] secondArray = {"A", "B", "C", "NOTA"};
            String winningParty = "";

            int maxVotes = 0;

            for (int party = 0; party < array.length; party++) {
                if (array[party] > maxVotes) {
                    maxVotes = array[party];
                    winningParty = secondArray[party];
                }
            }
            if (maxVotes > 50) {
                System.out.println(winningParty);
            } else {
                System.out.println(secondArray[3]);
            }
        }
    }
}
