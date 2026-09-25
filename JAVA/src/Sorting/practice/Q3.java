package Sorting.practice;

import java.util.Arrays;


// use when given is a range from 1 to N
public class Q3 {
    public static void main(String[] args) {
        int [] arr= {4,3,2,7,8,2,3,1};
        findduplicate(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int findduplicate(int[]arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int correct = arr[i]-1 ; // here it will calculate the correct index for that number
                if (arr[i] != arr[correct])
                    swap(arr, i, correct);
                else return arr[i];
            }
            else i++;
        }
    return -1;
    }

    static void swap(int [] arr, int x,int y)
    {
        int temp =arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }

}
