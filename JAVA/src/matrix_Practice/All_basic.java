package matrix_Practice;

import java.sql.SQLOutput;
import java.util.Arrays;



public class All_basic {
    public static void printDiagonals(int [][]arr){
       if(arr.length!= arr[0].length)return;
        System.out.println("Printing primary diagonals");
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i == j) System.out.println(arr[i][j]);
            }
        }

        System.out.println("Printing Secondary Diagonals:");
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <arr[0].length ; j++) {
                if(i+j== arr.length-1) System.out.println(arr[i][j]);
            }
        }
        }
    public static void printTranspose(int arr[][]){
        System.out.println("Printing Without in place transpose");
        int [][] transpose = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                transpose[j][i] = arr[i][j];
            }
        }


        for (int i = 0; i < transpose.length ; i++) {
            for (int j = 0; j <transpose[0].length; j++) {
            System.out.print(" "+transpose[i][j]);
            }
            System.out.println();
        }

        System.out.println("Priting IN place transpose");
        for (int i = 0; i <arr.length ;i++) {
            for (int j = i+1; j <arr[0].length ; j++) {
                int temp= arr[i][j];
                arr[i][j]= arr[j][i];
                arr[j][i]=temp;
            }
            }
        for (int i = 0; i < transpose.length ; i++) {
            for (int j = 0; j <transpose[0].length; j++) {
                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }
    }




    public static void main(String[] args) {
        int m =3;
        int n =3;
        int count=1;
        int [][] arr = new int[m][n];
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                arr[i][j]=count++;
                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }


        System.out.println("Print both diagonals:");
        printDiagonals(arr);
        System.out.println("Priting transpose:");
        printTranspose(arr);
    }
}

