package twoDarrbinary;

import java.util.Arrays;

public class Sorted2d {
    public static void main(String[] args) {

        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {33, 37, 38, 50}
        };


        System.out.println(Arrays.toString(binary(arr, 37)));

    }

    public static int [] binary(int[][] arr, int target) {
    int row =0;
    int col = arr.length -1;

    while( row < arr.length && col>=0)
    {
        if (arr[row][col] ==target)
        { return new int [] {row,col};
        }
        if (arr[row][col]<target)
        { row ++;
        }
        else
          col--  ;
    }

    return new int [ ] {0};
    }

}


