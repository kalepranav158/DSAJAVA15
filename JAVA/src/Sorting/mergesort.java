package Sorting;

import java.util.Arrays;

public class mergesort { // this is also inplace
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 6, 2, 7, 4, 1};
        arr = msort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static int[] msort(int[] arr, int start, int end) {
        if (end - start <= 1) {
            return Arrays.copyOfRange(arr, start, end); // base case: return single element
        }

        int mid = start + (end - start) / 2;
        int[] left = msort(arr, start, mid);
        int[] right = msort(arr, mid, end);

        return merge(left, right);

    }

    static int[] merge(int[] left, int[] right) {
        int[] mix = new int[left.length + right.length];
        int i=0 , j=0 , k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                mix[k++] = left[i++];
            } else {
                mix[k++] = right[j++];
            }
        }

        while (i < left.length) {
            mix[k++] = left[i++];
        }

        while (j < right.length) {
            mix[k++] = right[j++];
        }

        return mix;
    }
}
