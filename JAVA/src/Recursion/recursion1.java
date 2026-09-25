package Recursion;

public class recursion1 {
    public static void main(String[] args) {
        p1(0);

    }
  static void p1(int n)
    {
        System.out.println("Hey there....."+n);
       if (n<5) p1(n+1) ;
       else return;
    }

}
