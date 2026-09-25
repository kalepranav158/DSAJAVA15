package String_Questions;

public class Q242 {
    public static void main(String[] args) {
        String s1 ="arat";
        String s2="car";
        System.out.println(isAnagram(s1,s2));
    }
    public static boolean isAnagram(String s, String t) {
            int[] ans = new int [26];
            if (s.length()!=t.length()) return false;

            for (int i = 0; i <s.length() ; i++) {
                int idx1= s.charAt(i) -'a';
                int idx2= t.charAt(i) -'a';
                ans[idx1]++;
                ans[idx1]--;
            }
            for (int x : ans)
            { if (x!=0) return false;

            }
           return true;
        }
}





