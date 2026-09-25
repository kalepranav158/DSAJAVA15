package Recursion;

public class fabonacci {
    public static void main(String[] args) {
        System.out.println(fabo(50));
    }
    static int  fabo(int n)
        {
            if (n<2) {
                return n;
            }
            else return fabo(n-2)+fabo(n-1);
        }

}
