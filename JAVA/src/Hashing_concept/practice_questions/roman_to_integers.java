package Hashing_concept.practice_questions;
import java.util.HashMap;
public class roman_to_integers {
    static  String s= "VI";
   static public class romantoint {
       HashMap<String, Integer> map = new HashMap<>();

       public romantoint() {
           map.put("I", 1);
           map.put("V", 5);
           map.put("X", 10);
           map.put("L", 50);
           map.put("C", 100);
           map.put("D", 500);
           map.put("M", 1000);


       }

       public void helper() {
           int ans = helper(s, map);
           System.out.println("The Ans is :" + ans);

       }

       private int helper(String s, HashMap<String, Integer> map) {


           int ans = 0;

           for (int i = 0; i < s.length(); i++) {
               char c1 = s.charAt(i);
               if (map.containsKey(c1))

                   ans = ans + map.get(c1);
           }

          return ans;
   }

public static  void main(String[] args) {
     romantoint obj = new romantoint();

       obj.helper();
   }
}
}

