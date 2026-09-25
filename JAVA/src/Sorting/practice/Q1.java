package Sorting.practice;

import java.util.Arrays;

//Q  Given range given 1 to n return only missing number
public class Q1 {
    public static void main(String[] args) {
      int[]   arr= {0,1,2,4,5};

        sort(arr);
        System.out.println(Arrays.toString(arr));
        missing_number(arr);
    }

        static void sort(int []arr ) {
           int i = 0;
            while (i <= arr.length-1) {

                int correct = arr[i];
                if (correct < arr.length && arr[i] != arr[correct])
                  swap(arr,i,correct);
                else i++;
            }
    }
       static  void  missing_number(int [] arr) {
           int i = 0;
           while (i < arr.length)
           {
             if(arr[i]!=i)
               System.out.println("The nummber is : " +i);

              i++;
           }

       }
            static void swap(int [] arr, int x,int y)
            {
                int temp =arr[x];
                arr[x]=arr[y];
                arr[y]=temp;
            }

        }



