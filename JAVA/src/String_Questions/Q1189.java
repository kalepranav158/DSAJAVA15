package String_Questions;

import java.util.HashMap;
import java.util.HashSet;

public class Q1189 {
    public static void main(String[] args) {
      String  text = "leetcode";
        System.out.println(maxNumberOfBalloons(text));
    }
    public static int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : text.toCharArray()) {
            if (c=='b'||c=='a'||c=='l'||c=='o'||c=='n') {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }

        int b = map.getOrDefault('b', 0);
        int a = map.getOrDefault('a', 0);
        int l = map.getOrDefault('l', 0) / 2; // IMPORTANT
        int o = map.getOrDefault('o', 0) / 2; // IMPORTANT
        int n = map.getOrDefault('n', 0);

        return Math.min(b, Math.min(a, Math.min(l, Math.min(o, n))));
    }


}
