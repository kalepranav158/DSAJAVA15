package String_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Q49 {
    public static void main(String[] args) {

    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String,List<String>>map = new HashMap<>();

            for (String s : strs){
                char [] arr = new char[s.length()];
                Arrays.sort(arr);
                String key = new String(arr);

                if (map.containsKey(key)){
                    map.put(key,new ArrayList<>());
                }
                map.get(key).add(s);
            }

            return new ArrayList<>(map.values());
        }
}
