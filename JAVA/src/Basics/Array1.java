package Basics;

import java.util.Scanner;
import java.util.Arrays;

public class Array1
 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

     
    //    int []  rolln= {1,2,3,4,5};
    //    System.out.println(rolln[1]);
    //    String [] str =new String[2];
    //    str[0] =in.next();
    //    str[1] =in.next();
    //    System.out.println(str[0]);
    //    System.out.println(str[1]);
    System.out.println("Enter size of array");
    int n =in.nextInt();
    int [] arr =new int [n];
    // for(int i =0; i<arr.length;i++)
    // {
    //     System.out.println("Enter Elemenrt at "+i+ "  place:");
    //     arr[i]=in.nextInt();
    // } 
   
    // for(int i =0; i<arr.length;i++)
    // {
    //     System.out.println("Element at "+i+" place is :"+arr[i]);
       
    // } 
    
    //  for(int i =0; i<arr.length;i++)
    //   {
    //     System.out.println("Enter Elemenrt at " +i+ "  place:");
    //      arr[i]=in.nextInt();
        
    //   } 
    //   for(int x:arr)
    //   {
    //     System.out.println("Element at "+x+" place is :" +x);
          


     String[] str = new String[5];
      for(int i =0;i<str.length;i++)
      {   str[i] =in.next();

      }

      System.out.println(Arrays.toString(str));

    }
   
    
} 




