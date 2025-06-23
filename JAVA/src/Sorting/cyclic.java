package Sorting;

import java.util.Arrays;
import static Sorting.swap.swap1;

// use when given is a range from 1 to N
public class cyclic {
    public static void main(String[] args) {
        int [] arr= {5,3,1,4};
        sort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[]arr,int start,int end)
    {  int i =0;
        while(i< arr.length)
        {
            System.out.println("in while loop" +i);
            int correct = arr[i]-1; // here it will calculate the correct index for that number
            if(correct<=arr.length-1)
                 if (arr[i]!=arr[correct])   swap1(arr,i,correct);
            else i++;
           else
               swap1( arr, i, arr.length-1) ;

           i++;
        }

    }


}
