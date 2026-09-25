package TCS_Practice.Sorting;
import java.util.Scanner;
import java.util.Arrays;
public class All_Soring_Algorithms {

    // TC Best : O(n)
    // TC  Wraost O(n^2)
    // Space O(1);
    static void  bubble_sort(int[]arr){
        // In place sort using Swapping
        for(int i =0;i<arr.length;i++){
            boolean swap = false;
            for(int j=1;j<arr.length-i-1;j++){
              if(arr[j]<arr[j-1]) {
                 int temp = arr[j-1];
                 arr[j-1]= arr[j];
                 arr[j]= temp;
                 swap =true;
              }
            }
          if(!swap) break;
        }

   }



    // find Min index from the array that is left
    // TC O(n^2) for both best and wrost
    // SC O(n^2)
    static  void selection_sort(int arr[]){
        for(int i =0;i<arr.length;i++){
            int minindex= i;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<arr[minindex]) minindex =j;
            }
            int temp = arr[i];
            arr[i] =arr[minindex] ;
            arr[minindex] = temp;

        }

    }
    // Time Complexiety
    // Best O(N)
    // Wroast O(N^2)
   // Stable Sorting Algorithm We push the correct key to left Sorted Array
    public static void insertion_sort(int []arr){

        for(int i = 0;i<arr.length;i++){
            int key = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]= arr[j];
                j--;
            }
           arr[j+1]= key;
        }

      }


 public static void  merge_sort(int arr[],int start,int end){
      if(start>= end) return;

      int mid = start+(end-start)/2;

      merge_sort(arr,start,mid);
      merge_sort(arr,mid+1,end);

      merge(arr,start,mid,end);
 }

 // Divide and Conquer
 // Time Com : best O(nlogn)
    // Wroast O(nlogn)
    // Space O(N)

 private static void merge(int [] arr ,int start,int mid,int end){

        int n1 = mid -start+1;
        int n2 = end - mid;

        int [] l = new int[n1];
        int [] r= new int[n2];

        for(int i=0;i<n1;i++){
            l[i]= arr[start+i];

        }
       for(int i=0;i<n2;i++){
         r[i]= arr[mid+1+i];
     }

    int i=0;
       int j =0;

      int k=start;
       while(i<n1&&j<n2){
           if(l[i]<=r[j]) {
               arr[k] = l[i];
               i++;
           }
           else{
               arr[k]=r[j];
               j++;
           }
           k++;
       }

       while(i<n1) {
           arr[k]= l[i];
         i++;
         k++;
       }
       while(j<n2){
           arr[k]= r[j];
             j++;
             k++;
       }
 }



 public static void quick_sort(int arr[],int start,int end ){
        if(start<end){
            int pidx= partition(arr,start,end);

            quick_sort(arr,start,pidx-1);
            quick_sort(arr,pidx+1,end);
        }
 }
 private static int partition(int arr[],int start,int end){
        int pivot= arr[end];
        int i = (start-1);

        for(int j =start;j<end;j++){
            if(arr[j]<=pivot){
                i++;
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
            }
     }
       // remember to swap with i+1 ;
        int temp = arr[end];
        arr[end ]= arr[i+1];
        arr[i+1]= temp;


      return i+1;
    }


    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
             int n = sc.nextInt();

             int arr[] = new int[n];
             System.out.println("Enter the array Elements:");
             for(int i =0;i<n;i++){
                 arr[i]=sc.nextInt();
             }

           // System.out.println("Bubble Sort : "+Arrays.toString(arr));
           //selection_sort(arr);
            // System.out.println("Selection Sort : "+Arrays.toString(arr));
          //  System.out.println("Insertion Sort : "+Arrays.toString(insertion_sort(arr)));
          //merge_sort(arr,0,arr.length-1);
         quick_sort(arr,0,arr.length-1);
             System.out.println("Quick Sort:"+Arrays.toString(arr));

    }


}

