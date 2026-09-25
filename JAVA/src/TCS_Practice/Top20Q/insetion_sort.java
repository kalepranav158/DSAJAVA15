package TCS_Practice.Top20Q;
import java.util.Scanner;
public class insetion_sort {


    public static void insertion(int[]arr){
        for(int i =1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0&&key<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key; // swapped here
        }
    }

    public static void main(String[]args){

        Scanner sc= new Scanner(System.in);
        if(!sc.hasNextLine()){
            System.out.println("INVALID INPUT");
            return;
        }
        String nextLine = sc.nextLine().trim();
        if(nextLine.isEmpty()){
            System.out.println("INVALID INPUT");
            return;
        }
        String[] tokens = nextLine.split("\\s+");
        int arr[] = new int[tokens.length];
        for(int i=0;i<tokens.length;i++){
            try{
               arr[i]= Integer.parseInt(tokens[i]);
            } catch(NumberFormatException e ){
                System.out.println("INVALID INPUT");
            }
        }

        insertion(arr);



    }
}
