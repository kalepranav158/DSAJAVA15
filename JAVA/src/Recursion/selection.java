package Recursion;

import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1, 0};
        select(arr, arr.length - 1, 0, 0); // Added `maxIndex` argument
        System.out.println(Arrays.toString(arr));
    }

    static void select(int[] arr, int i, int j, int maxIndex) {
        if (i == 0) return;

        if (j <= i) {
            if (arr[j] > arr[maxIndex]) {
                maxIndex = j;
            }
            select(arr, i, j + 1, maxIndex);
        } else {
            // Swap max with end of unsorted part
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;

            select(arr, i - 1, 0, 0); // Start next round
        }
    }
}
