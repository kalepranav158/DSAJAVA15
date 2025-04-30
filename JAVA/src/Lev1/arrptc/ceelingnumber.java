package Lev1.arrptc;

public class ceelingnumber {

    public static void main(String[] args) {
        int [] arr ={11,32,56,98,128,132,150};
        int x=arr.length;
        System.out.println(ceeling(arr,0,arr.length -1,151));
        System.out.println(floor(arr,0,arr.length -1,5));

    }

    static int ceeling(int [] arr, int start ,int end,int key)
    {     if(key >arr[arr.length-1] )
              { return -1; }

        int mid =  start +(end - start )/2;
        while(start<=end) {
            if (arr[mid] == key) {
                return arr[mid];
            } else if (arr[mid] < key)
                return ceeling(arr, mid + 1, end, key);
            else if (arr[mid] > key)
                return ceeling(arr, start, mid - 1, key);


        }

        return arr[start++] ;
    }

    static int floor(int [] arr, int start ,int end,int key)
    {     if(key <arr[0] )
        { return -1; }

          int mid =  start +(end - start )/2;
          while(start<=end) {
            if (arr[mid] == key) {
                return arr[mid];
            } else if (arr[mid] < key)
                return floor(arr, mid + 1, end, key);
            else if (arr[mid] > key)
                return floor(arr, start, mid - 1, key);


        }
        return arr[end] ;
    }





}