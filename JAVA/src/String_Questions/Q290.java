package String_Questions;

import java.util.HashMap;

public class Q290 {
    public static void main(String[] args) {
        String t ="abba";
        String s="dog cat cat fish";
        System.out.println(wordPattern(s,t));
    }


    public static boolean wordPattern(String pattern, String s) {

        String[] s1 = s.split(" ");
        if(pattern.length() != s1.length) return false;

        HashMap<Character,String> map1= new HashMap<>();
        HashMap<String,Character>map2= new HashMap<>();

        for (int i = 0; i <s1.length; i++) {
            char c1 =  pattern.charAt(i);
            String t = s1[i];
            if (!map1.containsKey(c1)){
                if (map1.get(c1).equals(t)) {
                    return false;
                } else map1.put(c1,t);
            }
            if (!map2.containsKey(t)){
                if (map2.get(t).equals(c1)) return false;
                else map2.put(t,c1);
            }
        }
        return true;

    }
}
