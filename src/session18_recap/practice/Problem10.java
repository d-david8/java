package session18_recap.practice;

public class Problem10 {
    //Given the following code:
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        for (int num : nums) {
            if (num == 3) {
                break;
            }
            System.out.print(num + " ");
        }
    }
}
/*
What will be printed?
a) 1 2
b) 1 2 3
c) 1
d) 1 2 3 4 5
 */
