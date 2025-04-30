package Basics;

import java.util.Scanner;

public class basicop {
   public static void main(String[] args) {
    Scanner ut =new Scanner(System.in);
      /*  Fabonacci series
       int n =sc.nextInt();
       int a=0;
       int b=1;
       int count =0;
       while (count<=n) {
        int temp =b;
        System.out.println(b);
        b=b+a;
        a=temp;
        count++; */
       
       // Counting Ouccrances 
       /*System.out.println("Eneter a number");
       int n =sc.nextInt();
       int count =0;
       while(n>0) {
         
         int rem =n%10;  
         if (rem==3) 
         count ++;
         n=n/10;
      }
       System.out.println(count); */
      
       // Reverse a number 
       int ans=0;
       System.out.println("Enter a Number to reverse:");
       int num =ut.nextInt();
       
       while(num>0)

      {
           int rem =num%10;
           num/= 10;
          ans= ans*10+rem;

      }
     System.out.println(ans);
   }
  }
  