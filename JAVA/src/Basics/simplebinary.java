package Basics;

public class simplebinary {



        public static void main(String[] args) {
            int[] sortedArray = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
            int targetElement = 23;
            int result = binarySearch(sortedArray, targetElement);

            if (result != -1) {
                System.out.println("Element " + targetElement + " found at index " + result);
            } else {
                System.out.println("Element " + targetElement + " not found in the array");
            }

        }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

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

        return -1; // Target not found
    }




}

