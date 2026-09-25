package String_Questions;

public class Q1832Pangram {
    public static void main(String[] args) {
    String Sentence="leetcode";
        System.out.println(checkIfPangram(Sentence));
    }
    public static boolean checkIfPangram(String sentence) {
     int[] ans = new int [26];
     for (char c :sentence.toCharArray())
     {
         ans[c-'a']++;
     }

        for (int i = 0; i <26 ; i++) {
            if (ans[i]==0) return false;
        }
    return true;
    }
}
