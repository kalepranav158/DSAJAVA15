package Recursion;

public class practice02 {
    public static void main(String[] args) {
        System.out.println(revnum(3469));
        System.out.println(revnum2(3469,0));
        System.out.println(pall(3469643));
        System.out.println(cntzero(1050205000,0));
    }

    static int revnum(int n){ // done by second apporach
        int digits =(int)(Math.log10(n)) + 1 ;
        return helper(n,digits);
    }
    private static  int helper(int n , int args){
    if (n%10==n)
        return n;
    int rem = n%10;
    return rem* (int)Math.pow(10,args-1)+helper(n/10,args-1);

    }
    static int revnum2(int n, int rev) {
        if (n == 0) return rev;
        return revnum2(n / 10, rev * 10 + n % 10);
    }
    static boolean pall(int n)
    {
    return n == revnum2(n,0);
    }

static int cntzero(int n  , int cnt){
    if (n == 0) return cnt ;
    int rem = n%10;
    if (rem==0) return cntzero(n / 10, ++cnt);// increment first and then pass the value
    else return cntzero(n/10,cnt);
    }



}
/*
way one : declare sum outside the function and   int sum=0
           calculation will be   if n== 0 then return
                                 int rem = n%10
                                 sum = sum *10 +rem
                                 revnum(n/10)   then using recursion

way two :  use maths as logarithms

 */