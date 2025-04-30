package Lev1.arrptc;
import java.util.Arrays;

public class startandend {
    public static void main(String[] args) {
        int [] arr ={1,2,3,3,3,6,7,8};

        System.out.println(firstceeling(arr,0,arr.length -1,3)+" "+lastceeling(arr,arr.length -1,0,3));


    }

    static int firstceeling(int [] arr, int start ,int end,int key)
    {     if(key >arr[arr.length-1] )
         { return -1; }

        int mid =  start +(end - start )/2;
        while(start<=end) {
            if (arr[mid] == key) {
                return firstceeling(arr,start,mid-1,key);
            } else if (arr[mid] < key)
                return firstceeling(arr, mid + 1, end, key);
            else if (arr[mid] > key)
                return firstceeling(arr, start, mid - 1, key);


        }

        return mid ;
    }


    static int lastceeling(int [] arr, int start ,int end,int key)
    {     if(key >arr[arr.length-1] )
    { return -1; }

        int mid =  start +(end - start )/2;
        while(start<=end) {
            if (arr[mid] == key) {
                return lastceeling(arr,mid+1,end,key);
            } else if (arr[mid] < key)
                return lastceeling(arr, mid + 1, end, key);
            else if (arr[mid] > key)
                return lastceeling(arr, start, mid - 1, key);


        }

        return mid ;
    }
}


