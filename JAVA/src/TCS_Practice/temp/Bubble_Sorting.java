package TCS_Practice.temp;
import java.util.*;
import java.util.Scanner;


public class Bubble_Sorting {
    ///  main Algorithm is Move the Biggest to the end :
    public static void main(String [] args ){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Size of aarray");
      int n = sc.nextInt();
      int []arr = new int[n];
      System.out.println("Enter elements in array");
      for(int i =0;i<arr.length;i++){
          arr[i]= sc.nextInt();
      }
      System.out.println(Arrays.toString(bubble_sort(arr)));
    }

    public static  int[] bubble_sort(int [] arr){

        for(int i =0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }

    return arr;
    }
}
