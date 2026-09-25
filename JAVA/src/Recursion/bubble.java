package Recursion;

import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1,0};
        bub(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void bub(int[] arr, int i, int j) {
        if (i ==0 ) return;
        if (j < i) {
            if (arr[j] > arr[j + 1])
                arr[j] = arr[j] + arr[j + 1] - (arr[j + 1] = arr[j]); // One-liner swap without temp variabl

            bub(arr, i, ++j);

        }
         else {
            bub(arr, --i, 0);
        }
    }
}
