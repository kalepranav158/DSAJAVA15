package TCS_Practice.Leetcodes;
import java.util.*;
public class prime_number {

        public static boolean isprime(int n,int divisor){
            if (n <= 1) return false;

            if (divisor * divisor > n)
                return true;

            if (n % divisor == 0)
                return false;

            return isprime(n, divisor + 1);
        }

    public static void main(String[]args){
        int n = 29;

        if (isprime(n, 2))
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
    }

