package String_Questions;

import java.util.*;

public class Q187 {
    public static void main(String[] args) {
    String  s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
    String  s2 = "AAAAAAAAAAA";
        System.out.println(findRepeatedDnaSequences(s2));

    }

    public static List<String> findRepeatedDnaSequences(String s) {
        Set<String>seen = new HashSet<>();
        Set<String> result = new HashSet<>();

        for (int i = 0; i <=s.length()-10 ; i++) {
            String sub = s.substring(i, i + 10);
            if (seen.contains(sub)) {
                result.add(sub);
            } else seen.add(sub);
        }
     return  new ArrayList<>(result);
    }




}



