package Recursion;

import java.util.ArrayList;

public class array {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,2};
        System.out.println(sorted(arr,0));
        System.out.println(lsearch(arr,2,0));
        System.out.println(occ);
    }
static boolean sorted(int[] arr,int i)
{    if (i==arr.length-1) return true;
    if (arr[i]<arr[i+1] &&  sorted(arr,++i)  )
        return true;
    return false;}

    static ArrayList < Integer> occ  =new ArrayList<>();
    static int lsearch(int[] arr, int t , int i) {
        if(arr[i]==t) occ.add(i);
        if(i== arr.length-1) return i;
        else return lsearch(arr,t,++i);
    }
}
