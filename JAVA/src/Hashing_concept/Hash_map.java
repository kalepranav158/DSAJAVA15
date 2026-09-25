package Hashing_concept;
import java.util.HashMap;
import java.util.Map;

public class Hash_map {

    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();

        // insertion
        map.put("India",120);
        map.put("US",20);
        map.put("China",204);

        System.out.println(map);
        map.put("china",105);
        System.out.println(map);

        // search
        if (map.containsKey("India")) System.out.println("true");;
        int x=map.get("US");
        System.out.println(x);

        // iteration
        int [] arr ={1,2,3};
        for (int val:arr) System.out.println(val);

        for (Map.Entry<String,Integer>e:map.entrySet()) {
            System.out.println(e.getKey()+":"+ e.getValue());
        }

        for (Map.Entry<String,Integer> y: map.entrySet()){
            System.out.println();
        }
        for (Map.Entry<String,Integer>z:map.entrySet()){}

        for (Map.Entry<String,Integer>a:map.entrySet()){}


    }
}
