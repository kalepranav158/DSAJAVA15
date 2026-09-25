package Array_Questions;

import java.util.Arrays;

public class Q34 {
    public static void main(String[] args) {
    int [] nums = {5,7,7,8,8,10};
    int target=8;
     int []ans=  searchRange(nums,target);
        System.out.println(Arrays.toString(ans));

    }

    public static int[] searchRange(int[] nums, int target) {

       int [] ans = new int[2];
       int start = 0;
       int end = nums.length-1;
       ans[0]= first(nums,target,start,end);
       ans[1]=last(nums,target,start,end);
        return ans;
    }


     public static int first(int[] nums, int target, int start, int end){
        if (start>end) return -1;

        int mid = start +(end-start)/2;


        if (nums[mid]==target) {
            if (mid == 0 || nums[mid - 1] != target) return mid;
            return first(nums, target, start, mid - 1);
        }
            if (nums[mid]<target) return first(nums,target,mid+1,end);

        return  first(nums,target,start,mid-1);

    }

    public static int last(int [] nums, int target,int start,int end){
        if (start>end) return -1;

        int mid = start +(end-start)/2;


        if (nums[mid]==target) {
            if (mid == nums.length-1 || nums[mid + 1] != target) return mid;
            return first(nums, target, mid+1, end);
        }
        if (nums[mid]<target) return first(nums,target,mid+1,end);

        return  first(nums,target,start,mid-1);

    }


}
