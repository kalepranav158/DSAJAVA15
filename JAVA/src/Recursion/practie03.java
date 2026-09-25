package Recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class practie03 {
    public static void main(String[] args) {
     int [] arr ={1,2,3,4,5,4,8,9};
     ArrayList<Integer> y =  findidx(arr,4,0,new ArrayList<>());
         System.out.println(y);
        System.out.println(findidx2(arr,4,0));
    }
    static ArrayList<Integer> findidx(int [] arr, int target, int index,ArrayList<Integer> x)
    {      if(index== arr.length) return x;
           if (arr[index]==target)   x.add(index);
           findidx(arr,target,++index,x);
           return x;
    }


    // in this pattern we are not passing an parameter
    // to solve this we will use the algo :
    // return the curret ans + function call ans ;

   static ArrayList<Integer> findidx2(int [] arr, int target , int index)
   {  ArrayList<Integer> x = new ArrayList<>();
       if (index==arr.length) return x;
       if (arr[index]==target) x.add(index); // ans for that function call only
      ArrayList<Integer> ansfrom_below= findidx2(arr,target,++index);
      x.addAll(ansfrom_below);  // used all
     return x;
   }

}
