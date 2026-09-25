package Array_Questions;

import java.util.HashSet;

public class Q3 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i <s.length(); i++) {
            if (set.contains(s.charAt(i))){
                 set.clear();
            }
            else set.add(s.charAt(i));
        }
        return set.size();




    }





}

