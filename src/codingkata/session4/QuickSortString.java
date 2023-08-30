package codingkata.session4;

import java.util.Scanner;

public class QuickSortString {

    public static void main(String[] args) {
        int[] numbers = getInputNumbers();
        System.out.println(numbers.length);

        quickSort(numbers, 0, numbers.length - 1);
        for (int i : numbers) {
            System.out.print(i + " ");
        }
    }

    public static void quickSort(int[] array, int left, int right) {
        int m = (left + right) / 2;
        int x = array[m];

        int i = left;
        int j = right;
        do {
            while (array[i] < x)
                i++;
            while (array[j] > x)
                j--;
            if (i <= j) {
                int aux = array[i];
                array[i] = array[j];
                array[j] = aux;
                i++;
                j--;
            }
        } while (i <= j);
        if (left < j) {
            quickSort(array, left, j);
        }
        if (right > i) {
            quickSort(array, i, right);
        }
    }

    public static int[] getInputNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string of numbers separated by spaces: ");
        String[] numStrings = scanner.nextLine().split(" ");

        int[] numbers = new int[numStrings.length];

        for (int i = 0; i < numStrings.length; i++) {
            numbers[i] = Integer.parseInt(numStrings[i]);
        }

        return numbers;
    }
}

