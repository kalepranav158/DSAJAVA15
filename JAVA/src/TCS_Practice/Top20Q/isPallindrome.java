package TCS_Practice.Top20Q;
import java.util.Scanner;
public class isPallindrome {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        if(s.isEmpty()) {
            System.out.println("INVALID INPUT");
            return;
        }
        int left=0;
        int right=s.length()-1;

       boolean is = true;
       while(left<right){
           char c1 = s.charAt(left);
           char c2 = s.charAt(right);
           if(c1!=c2) {
               is=false;
               break;
           }
           left++;
           right--;
       }

       System.out.println();
    }
}
