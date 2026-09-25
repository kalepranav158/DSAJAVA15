package Recursion;

public class Practice {
    public static void main(String[] args) {
    show(10);
        System.out.println();
    showrev(10);
        System.out.println();
        System.out.println(prod(10));
        System.out.println();
        System.out.println(sum(10));
    }

    static void show(int n )
    {
        System.out.println(n);
         if (n>1) show(n-1);
    }
    static void showrev(int n )
    {
        if (n>1) showrev(n-1);
        System.out.println(n);
    }

    static int prod(int n)
    {    if (n<1) return 1;
        return n* prod(n-1);
    }
    static int sum(int n)
    {    if (n<1) return 1;
        return n+ sum(n-1);
    }

}
