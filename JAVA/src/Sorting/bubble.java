package Sorting;

import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
    int[] arr ={1,2,3,4,5,6};

        System.out.println(Arrays.toString(sort(arr)));

    }

        static int [] sort ( int[] arr)
        {   boolean swap = false;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 1; j < arr.length - i; j++) {
                    if (arr[j] < arr[j - 1]) {
                        int t = arr[j - 1];
                        arr[j - 1] = arr[j];
                        arr[j] = t;
                       swap=true;
                    }
                }
                if (!swap) {
                    break;
                }
            }
            return arr;
        }
}