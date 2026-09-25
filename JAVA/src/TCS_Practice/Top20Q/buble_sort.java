package TCS_Practice.Top20Q;
import java.util.Scanner;
public class buble_sort {

    public static void bubblesort(int []arr){

        for(int i=0;i<arr.length;i++){
            boolean swapped = false;
            for(int j=1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                  int temp = arr[j];
                  arr[j]= arr[i];
                  arr[i]=temp;
                }
              if(!swapped)break;
            }
        }
    }


    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int []arr= new int[n];
        for(int i =0;i<n;i++){
         arr[i]= sc.nextInt();
        }
        bubblesort(arr);
        for(int x:arr){
           // system.out.print(x)
        }

    }
}
