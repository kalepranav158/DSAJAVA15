package String_Questions;

import java.util.HashMap;
import java.util.HashSet;

public class Q389 {
    public static void main(String[] args) {
    String s ="abcd";
    String t="abcde";
        System.out.println(findTheDifference(s,t));
    }

    public static char findTheDifference(String s, String t) {

        HashSet<Character> set = new HashSet<>();
        char []s1=s.toCharArray();
        char []t1=t.toCharArray();

        for (char c : s1){
            set.add(c);
        }
       for (char c :t1){
           if (!set.contains(c)) return  c;
       }
        return '\0';
    }

}
