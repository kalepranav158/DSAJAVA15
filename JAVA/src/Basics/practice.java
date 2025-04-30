package Basics;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enetr 10 elements in array:");
        for (int i = 0; i < arr.length; i++)
            arr[i] = in.nextInt();

        int x =0;
        for (int i =0 ;i < arr.length;i++)
        {    x +=even(arr[i]);

        }

        System.out.println("The even elements in array are :" + x);
    }

    static int count1(int n)
    {   int cnt =0;
        while(n>0)
        {
             cnt++;
             n=n/10;

        }
        return cnt;
    }
 static int even(int n) {
       int even_digit = count1(n);
       if (even_digit % 2==0)
        return 1;
   return  0;
    }




}
