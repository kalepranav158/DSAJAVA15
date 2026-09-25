package String_Questions;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Q451 {
    public static void main(String[] args) {

        frequencySort("tree");
    }

    public static String frequencySort(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<Character> list = new ArrayList<>(map.keySet());

        Collections.sort(list, (a, b) -> map.get(b) - map.get(a));

        StringBuilder sb = new StringBuilder();

        for(char c : list){
            int freq = map.get(c);
            for(int i = 0; i < freq; i++){
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
