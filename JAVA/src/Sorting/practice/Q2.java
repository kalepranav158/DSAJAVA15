package Sorting.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Q  Given range given 1 to n return only missing number
public class Q2 {

    public static void main(String[] args) {
        Q2 obj = new Q2();
        int[] arr = {4, 3, 2, 7, 8, 2, 1};
        System.out.println("Missing numbers: " + obj.findmissingarray(arr));
    }

    public  List<Integer> findmissingarray(int[] nums) {
        int i = 0;
        while (i <= nums.length -1) {

            int correct = nums[i]-1;
            if (correct < nums.length && nums[i] != nums[correct])
                swap(nums, i, correct);
            else i++;
        }
        List<Integer> ans= new ArrayList<>();
    {
        for (int index = 0; index < nums.length; index++)
        {
            if (nums[index]!= index+1)
            {
                ans.add(index + 1);
            }
        }
    }
   return ans;
    }
    static void swap(int [] arr, int x,int y)
    {
        int temp =arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
}



