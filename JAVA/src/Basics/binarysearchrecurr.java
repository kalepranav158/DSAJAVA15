package Basics;

public class binarysearchrecurr {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6,7,8};

        System.out.println(search(arr,0,arr.length -1,4));
        System.out.println(search(arr,0,arr.length -1,9));

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
