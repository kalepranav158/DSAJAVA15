package Recursion;

public class patterns {
    public static void main(String[] args) {
        star(0, 0);
    }

    static void star(int i, int j) {
        if (i == 5) return;
        if (j < i) {
            System.out.print("*");
            star(i, ++j);
        } else {
            System.out.println(" ");
            star(++i, 0);
        }
    }
}


