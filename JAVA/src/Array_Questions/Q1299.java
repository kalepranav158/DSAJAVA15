package Array_Questions;

public class Q1299 {
    public static void main(String[] args) {

    }

    public int[] replaceElements(int[] arr) {
    int curr =0;
    int max =-1;
    int last =arr.length-1;
    while(curr!=arr.length-1) {
        for (int x : arr) {
            max = Math.max(max, x);
        }
        if (max > arr[curr]) {
            arr[curr] = max;
            arr[last] = -1;
        }
    }
   return arr;
    }


}
