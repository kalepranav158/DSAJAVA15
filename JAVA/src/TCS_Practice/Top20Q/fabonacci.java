package TCS_Practice.Top20Q;
import java.util.Scanner;
public class fabonacci {


    public static int helper(int n){
        if(n==0)return 0;
        if(n==1)return 1;
        return helper(n-1)+helper(n-2);
    }



    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if(n<=0)
        {
            System.out.println("INVALID INPUT");
            return;
        }

        for(int i=0;i<n;i++){
            System.out.print(helper(i)) ;
            if(i<n-1)System.out.println(" ");
       }
    }
}
