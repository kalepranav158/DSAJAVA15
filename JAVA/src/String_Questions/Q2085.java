package String_Questions;

import java.util.HashSet;

public class Q2085 {
    public static void main(String[] args) {
      String []  words1 = {"a","ab"};
      String [] words2 = {"a","a","a","ab"};


        System.out.println(countWords(words1,words2));
    }
    public static int countWords(String[] words1, String[] words2) {
    int ans =0  ;
        HashSet<String>set1 = new HashSet<>();
        HashSet<String>set2 = new HashSet<>();
        for (int i = 0; i <words1.length ; i++) {
            if (set1.contains(words1[i])) ans--;
            set1.add(words1[i]);
        }

        for (int i = 0; i <words2.length ; i++) {
            if (set1.contains(words2[i])) ans--;
            if (set1.contains(words2[i])) ans++;
             set1.add(words2[i]);
        }

    return ans;

    }

}
