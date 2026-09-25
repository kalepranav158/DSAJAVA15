import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Q350 {
    public static void main(String[] args) {
        int [] arr1={4,9,5};
        int [] arr2={9,4,9,8,4};
        List<Integer>ans = new ArrayList<>();
          HashMap<Integer,Integer> map = new HashMap<>();
     if (arr1.length>arr2.length) { // count Frequency
         for (int i = 0; i < arr1.length; i++) {

             if (!map.containsKey(arr1[i])) {
                 System.out.println(arr1[i]);
                 map.put(arr1[i], 1);
             } else
                 map.put(arr1[i], map.get(arr1[i]) + 1);
             System.out.println(map.get(arr1[i]));
         }

         // add the common in array
         for (int i = 0; i < arr2.length; i++) {
             if (map.containsKey(arr2[i])) {
                 {
                     map.put(arr2[i], 0);
                     ans.add(arr2[i]);
                 }
             }
         }
     }
      else {
         for (int i = 0; i < arr2.length; i++) {

             if (!map.containsKey(arr2[i])) {
                 System.out.println(arr2[i]);
                 map.put(arr2[i], 1);
             } else
                 map.put(arr2[i], map.get(arr2[i]) + 1);
             System.out.println(map.get(arr2[i]));
         }

         // add the common in array
         for (int i = 0; i < arr1.length; i++) {
             if (map.containsKey(arr1[i])) {
                 {
                     map.put(arr1[i], 0);
                     ans.add(arr1[i]);
                 }
             }
         }
     }
        System.out.println(ans);

         }
    }

