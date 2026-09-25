package Lev1.arrptc;

public class startandend {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 3, 3, 6, 7, 8};
        int key = 3;

        int first = firstceeling(arr, 0, arr.length - 1, key);
        int last = lastceeling(arr, 0, arr.length - 1, key);

        System.out.println(first + " " + last);
    }

    // Find first occurrence
    static int firstceeling(int[] arr, int start, int end, int key) {

        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == key) {
            // check if it is first occurrence
            if (mid == 0 || arr[mid - 1] != key) {
                return mid;
            }
            return firstceeling(arr, start, mid - 1, key);
        }

        if (arr[mid] < key) {
            return firstceeling(arr, mid + 1, end, key);
        }

        return firstceeling(arr, start, mid - 1, key);
    }

    // Find last occurrence
    static int lastceeling(int[] arr, int start, int end, int key) {

        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == key) {
            // check if it is last occurrence
            if (mid == arr.length - 1 || arr[mid + 1] != key) {
                return mid;
            }
            return lastceeling(arr, mid + 1, end, key);
        }

        if (arr[mid] < key) {
            return lastceeling(arr, mid + 1, end, key);
        }

        return lastceeling(arr, start, mid - 1, key);
    }
}
