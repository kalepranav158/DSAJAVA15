package String_Questions;

public class Q1704 {
    public static void main(String[] args) {
     String s = "textbook";
     System.out.println( halvesAreAlike(s));
    }

    public static boolean halvesAreAlike(String s) {
        int left = 0;
        int right = s.length();
        int mid = left + (right - left) / 2;
        char[] x = s.toCharArray();

        int c1 = 0;
        int c2 = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(x[i]);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                if (i < mid) c1++;
                else c2++;
            }
        }

        return c1 == c2;

    }
}