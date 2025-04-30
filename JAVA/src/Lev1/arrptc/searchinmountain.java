package Lev1.arrptc;

public class searchinmountain {
    public static void main(String[] args) {
        int [] arr ={1,3,4,5,4,3};

        int peak =peaksearch(arr,0,arr.length -1);
        System.out.println(search(arr,0,peak,2));
        System.out.println(search(arr,arr.length -1,peak,3));

    }





    static int  peaksearch(int [] arr, int start ,int end)
    {     int mid =  start +(end - start )/2;
        while(start<=end) {
            if (arr[mid] >= arr[mid+1]&& arr[mid]>=arr[mid-1]) {
                return mid ;
            } else if (arr[mid] <arr[mid+1] && arr[mid]> arr[mid-1])
                return peaksearch(arr, mid + 1, end);
            else if (arr[mid] >arr[mid+1] && arr[mid]< arr[mid-1])
                return peaksearch(arr, start, mid - 1);

        }
        return 0;
    }

    static boolean search(int [] arr, int start ,int end,int key)
    {     int mid =  start +(end - start )/2;
        while(start<=end) {
            if (arr[mid] == key) {
                return true;
            } else if (arr[mid] < key)
                return search(arr, mid + 1, end, key);
            else if (arr[mid] > key)
                return search(arr, start, mid - 1, key);


        }
        return false;
    }





}
