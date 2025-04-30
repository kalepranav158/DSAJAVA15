package Lev1.arrptc;

public class peakofmountain {
    public static void main(String[] args) {
    int [] arr ={1,2,3,4,5,4,3};

    System.out.println(search(arr,0,arr.length -1));
   // System.out.println(search(arr,0,arr.length -1));

}

    static int  search(int [] arr, int start ,int end)
    {     int mid =  start +(end - start )/2;
        while(start<=end) {
            if (arr[mid] >= arr[mid+1]&& arr[mid]>=arr[mid-1]) {
                return mid;
            } else if (arr[mid] <arr[mid+1] && arr[mid]> arr[mid-1])
                return search(arr, mid + 1, end);
            else if (arr[mid] >arr[mid+1] && arr[mid]< arr[mid-1])
                return search(arr, start, mid - 1);


        }
        return 0;
    }
}



