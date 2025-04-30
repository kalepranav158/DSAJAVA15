package Sorting;

import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
     int [] arr= {1,2,4,10,3,7,2,8,9};
        System.out.println(Arrays.toString(sort(arr)));
    }

  static int [] sort (int []arr)
   {
           for (int i =0; i <arr.length;i++)
           {
               int last = arr.length- i-1;
               int max = maxidx(arr,0,last);
               swap(arr, max ,last);
           }
   return arr;
   }

   static int maxidx (int [] arr, int start, int last)
    {   int max =start;
        for (int i = max ; i<= last;i++ )
        {   if (arr[max]<arr[i])
              max = i;
        }
     return max;
    }
  static void swap(int [] arr,int  x,int y)
  {   int temp =arr[x];
      arr[x]=arr[y];
      arr[y]=temp;
  }
}
