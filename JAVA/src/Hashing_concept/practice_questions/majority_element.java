package Hashing_concept.practice_questions;

import java.util.HashMap;
import java.util.Map;

public class majority_element {

    public static void main(String[] args) {
        int[] nums = {1,3,2,5,1,3,1,5,1};
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++)
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        for (Map.Entry<Integer,Integer>e:map.entrySet())
        {
            if (e.getValue()> nums.length/3) System.out.println(e.getKey()+" "+e.getValue());
        }
    }

}

//
//class Solution {
//    public List<Integer> majorityElement(int[] nums)
//    {
//        int n=nums.length;
//        ArrayList<Integer>l=new ArrayList<>();
//        HashMap<Integer,Integer>mp=new HashMap<>();
//        int a=0;
//        if(n<3){
//            for(int i:nums){
//                if(a!=i){
//                    l.add(i);
//                }
//                a=i;
//            }
//            return l;
//        }
//
//
//        for(int i:nums){
//            if(!mp.containsKey(i)){
//                mp.put(i,1);
//            }
//            else{
//                mp.put(i,mp.get(i)+1);
//            }
//        }
//
//        for(int i:mp.keySet()){
//            if(mp.get(i)>n/3){
//                l.add(i);
//            }
//        }
//        return l;
//    }
//    static {
//        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
//            try (FileWriter writer = new FileWriter("display_runtime.txt")) {
//                writer.write("0");
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }));
//    }
//}