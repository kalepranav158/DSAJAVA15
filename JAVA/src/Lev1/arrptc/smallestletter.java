package Lev1.arrptc;

public class smallestletter {

    public static void main(String[] args) {
        char [] arr ={'a','b','c','d','e'};

        System.out.println(ceeling(arr,0,arr.length -1,'d'));
        //System.out.println(floor(arr,0,arr.length -1,5));

    }

    static char ceeling(char [] arr, int start ,int end,char key)
    {

           int mid =  start +(end - start )/2;
           while(start<=end) {
               if (arr[mid] == key) {
                   return arr[mid + 1];
               } else if (arr[mid] < key)
                   return ceeling(arr, mid + 1, end, key);
               else if (arr[mid] > key)
                   return ceeling(arr, start, mid - 1, key);
           }

          return arr[0] ;

    }


}
