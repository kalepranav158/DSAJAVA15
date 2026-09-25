package String_Questions;

public class Q387 {
    public static void main(String[] args) {
        String s = "";
        firstUniqChar(s);
    }

    public static int firstUniqChar(String s) {
        int[] ans = new int[26];

        for (int i = 0; i < s.length(); i++) {
            ans[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (ans[s.charAt(i)] - 'a' == 1) return i;



        }
        return -1;
    }
}


