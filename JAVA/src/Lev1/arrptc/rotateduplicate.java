package Lev1.arrptc;
import Lev1.arrptc.rotatebinary;
public class rotateduplicate {
    public static void main(String[] args) {
        int[] arr = {1,1,3,4,4,2,2};
        System.out.println(rotatebinary.search(arr,1));
    }

    public static int findpivot(int[] arr){
        int start =0;
        int end = arr.length;

        while(start<=end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1])
                return mid;
            if (arr[mid] < arr[mid - 1])
                return mid - 1;
            if (mid > start && arr[mid] < arr[mid - 1]) {
                end = mid - 1;
            } else
                start = mid + 1;

            //condtiion for checking the duplicates and skipping them
            if ( arr[mid]==arr[start] || arr[mid]==arr[end])
            {
                if(arr[start]> arr[start+1])
                    {return  start;}
                    start++;
                if (arr[end]<arr[end-1])
                    return end;
                end--;
            }
            else if(arr[start]<arr[mid]||(arr[start]==arr[mid]&&arr[mid]>arr[end]))
               start = mid +1;
            else
                end =mid -1;

        }
        return -1 ;
    }
















}
