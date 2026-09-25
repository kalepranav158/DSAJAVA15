package String_Questions;

public class Q1662 {
    public static void main(String[] args) {
       String []word1 = {"ab", "c"};
       String[] word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1,word2));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String ans1 = "";
        String ans2="";
        for (String s1:word1){
         ans1 += s1;
        }
        for (String s2:word2){
            ans2+=s2;
        }
        if (ans1.equals(ans2)) return  true;

      return  false;


    }
}
