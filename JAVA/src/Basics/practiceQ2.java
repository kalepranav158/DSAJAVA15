package Basics;

import java.util.Scanner;

public class practiceQ2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr3 = {
                {1, 2, 3},
                {1, 2, 0},
                {8, 9, 5}
        };
        int[] total = new int[3];
        for (int row = 0; row < arr3.length; row++)
            for (int col = 0; col < arr3[row].length;col++) {
                total[row] += arr3[row][col];
            }
        System.out.println("The max wealth is :"+ Max(total));
    }

    static int Max(int[] arr) {
        int max = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }
}
