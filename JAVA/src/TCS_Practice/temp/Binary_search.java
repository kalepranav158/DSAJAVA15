package TCS_Practice.temp;
import java.util.*;
import java.util.Scanner;
public class Binary_search {
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter the size of array:");
     int n = sc.nextInt();
    int  arr[]= new int[n];
     System.out.println("Enter the array elements in sorted order:");
     for(int i =0;i<n;i++){
         arr[i]=sc.nextInt();
     }
     System.out.println("Enter the target element:");
     int target = sc.nextInt();


     int index= binarysearch(arr,target);
     System.out.println("The index is:"+index);
    }

    public static int binarysearch(int [] ans,int target){
        int start =0;
        int end =  ans.length-1;
        int mid = start+ (end -start)/2;

        while(start<end){
            if(ans[mid]==target)return mid;
            if(ans[mid]>target) end = mid-1;
            else start = mid+1;
        }


        return -1;
    }
}
