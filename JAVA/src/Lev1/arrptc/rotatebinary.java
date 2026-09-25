package Lev1.arrptc;
import Lev1.arrptc.peakofmountain;
import Lev1.arrptc.rotateduplicate;
public class rotatebinary {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 1, 2, 3,};
        System.out.println(search(arr, 2));

    }



    public static int binarySearch(int[] arr, int target,int right, int left) {

        while (left <= right) {
            int mid = left + (right - left) / 2; // Prevents potential overflow

            if (arr[mid] == target) {
                return mid; // Target found
            } else if (arr[mid] < target) {
                left = mid + 1; // Search right half
            } else {
                right = mid - 1; // Search left half
            }
        }

        return -1;
    }


    public static int search(int [] arr , int target) {
        int pivot = rotateduplicate.findpivot(arr);

        if (pivot == -1) {
            binarySearch(arr, target, 0, arr.length);
        }
        if (arr[pivot] == target) {
            return pivot;
        }
        if (target >= arr[0])
           return binarySearch(arr, 0, pivot - 1, target);
        else
           return binarySearch(arr, pivot + 1, arr.length, target);
    }

}







