package Lev1;
import java.util.Scanner;

public class practiceset1 {
    public static void main(String[] args) {
     Scanner in =new Scanner (System.in) ;
     System.out.println("Enter a number to check prime or not:");
     int n =in.nextInt(); 
     System.out.println(isprime(n)); 
     
     System.out.println("Enter a Number to count the armstrong number");
     int x =in.nextInt();
     System.out.println(armnumber(x));
    }
    
    static boolean isprime(int n)
     {      
            for(int i =n-1; n>1;n--)
             {
                if (n%i==0) 
                    return false;
               
                  
             }
             return true;                                      
    }

    static int armnumber(int x)
    {
      
       int ans =0;
       while(x>0) {
         
         int rem =x%10;  
          ans+= rem*rem*rem ;
        
            x=x/10;
      }
       return ans;
    }


}
