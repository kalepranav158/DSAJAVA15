package TCS_Practice.Top20Q;
import java.util.Scanner;
public class binary_search {
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int arr[]= new int[n];
    for(int i =0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int target = sc.nextInt();


    int left=0;
    int right = n-1;
    while(left<right){
    int mid = left+(right-left)/2;
    if(arr[mid]==target)System.out.print(mid);
    else if(arr[mid]>target) {
        right=mid-1;
    } else{ left= mid+1;
    }
    }

}
}
