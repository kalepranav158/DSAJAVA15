package Lev1.arrptc;

public class posinfnite {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8,9,10,11,12,13,14,15,16,17,18};

        System.out.println(search(arr, 0, 1, 15));
       // System.out.println(search(arr, 0, 1, 9));

    }

    static boolean search(int[] arr, int start, int end, int key) {


        if (key <= arr[end]) {
            int mid = start + (end - start) / 2;
            while (start <= end) {
                if (arr[mid] == key) {
                    return true;
                } else if (arr[mid] < key)
                    return search(arr, mid + 1, end, key);
                else if (arr[mid] > key)
                    return search(arr, start, mid - 1, key);


            }
            return false;
        }
      //  System.out.println(start+" "+end);

        start = end + 1;
        end = end * 2;
        System.out.println(start+" "+end);
        return search(arr, start, end, key);


    }
}



