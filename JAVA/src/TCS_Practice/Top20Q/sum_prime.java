package TCS_Practice.Top20Q;
import java.util.Scanner;
import java.util.ArrayList;
public class sum_prime {

    public static boolean isPrime(int n,int divisor){
        if (n <= 1) return false;

        if (divisor * divisor > n)
            return true;

        if (n % divisor == 0)
            return false;

        return isPrime(n, divisor + 1);
    }

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        if(!sc.hasNextLine()){
            System.out.println("INVALID INPUT");
        }
        String s = sc.nextLine().trim();
        String[] s1= s.split(",");
        int m= Integer.parseInt(s1[0]);
        int n= Integer.parseInt(s1[1]);

        if(m<0||n<0)
        {
            System.out.println("INVALID INPUT");
            return;
        }
        ArrayList<Integer> list= new ArrayList<>();

        for(int i=m;i<=m+n;i++)
        if(isPrime(i,2)){
            list.add(i);
        }
        int sum=0;
        for(int x:list.toArray(new Integer[0])){
            sum+=sum;
        }
        System.out.println(sum);
    }
}
