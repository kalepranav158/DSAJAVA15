package TCS_Practice.Leetcodes;
import java.util.*;
public class Leep_year {

        public static void main(String [] args){
            System.out.println("Enter the year to check leep or not");
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            if(x%400==0) System.out.println("True");
            else if(x%100==0) System.out.println("False");
            else if(x%4==0) System.out.println("True");
           else System.out.println("False");
        }
}
