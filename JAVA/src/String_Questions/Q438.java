package String_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.SplittableRandom;

public class Q438 {
    public static void main(String[] args) {
     
        String s="";
        String p="";
        System.out.println(findAnagrams(s,p));
    }

    public static List<Integer> findAnagrams(String s, String p) {
         List<Integer>ans= new ArrayList<>();
         int [] scount = new int[26];
         int [] pcount = new int [26];

         if (s.length()<p.length())return ans;
        for (char c : p.toCharArray()) {
                 pcount[c-'a']++;
        }

        for (int i = 0; i <s.length() ; i++) {

           scount[s.charAt(i)-'a']++;

           if (i>=p.length()) scount[s.charAt(i-p.length())-'a']--;

           if (Arrays.equals(scount,pcount)){
               ans.add(i-p.length()+1);
        }
        }
   return  ans;
    }

}
