package Hashing_concept.practice_questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;


public class phone_key {
    static HashMap<String, String> map;

    public phone_key() {
        map.put("1", null);
        map.put("2", "abc");
        map.put("3", "def");
        map.put("4", "efg");
        map.put("5", "hij");
    }


    static class Solution {
        public List<String> letterCombinations(String digits) {
            HashMap<String, Integer> map2 = new HashMap<>();
            List<String> ans = new ArrayList<>();
            for (int i = 0; i < digits.length(); i++) {
                {
                    char d1 = digits.charAt(i);
                    char d2 = digits.charAt(i + 1);
                    if (map.containsKey(d1) && map.containsKey(d2)) ;
                    String s1 = map.get(d1);
                    String s2 = map.get(d2);
                    for (int j = 0; j < s1.length(); j++) {

                        for (int k = 0; k < s2.length(); k++) {

                            ans.add(s1.charAt(j) + "" + s2.charAt(k));

                        }
                    }
                }

            }
                    return ans;
        }
    }
}







