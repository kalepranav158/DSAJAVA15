package Basics;

import java.util.Scanner;

public class Array2d
{
   public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   
   System.out.println("Enter the number of rows :");
   int row = in.nextInt();
   System.out.println("Enter the number of column :");
   int col = in.nextInt();

   int [][] arr = new int [row][col];
   //System.out.println(arr.length);
   
   int i,j;
   for( i=0 ;i <row; i++ ){
     for( j=0 ; j< col; j++)
     {  arr[i][j] = in.nextInt();

     }
     
     
   for( i=0 ;i <row; i++ )
   for( j= 0 ; j<col;j++)
   {  System.out.println(arr[i][j]);
   }}


}
}