package String_Questions;

import java.util.HashSet;

public class Q771 {
    public static void main(String[] args) {

    }


    public static int numJewelsInStones(String jewels, String stones) {
     int ans  =0;
        HashSet<Character> map= new HashSet<>();
        for (char j: jewels.toCharArray())
            if (!map.contains(j))
                map.add(j);


        for (char s:stones.toCharArray() )
            if (map.contains(s)) ans++;

        return ans;

    }
}
