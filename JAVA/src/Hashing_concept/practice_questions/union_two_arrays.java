package Hashing_concept.practice_questions;

import java.util.ArrayList;
import java.util.HashMap;

public class union_two_arrays {
    public static void main(String[] args) {
        int []nums1={1,2,3,4,5,6,7,8};
        int []nums2={5,6,7,8,9,10};
        HashMap<Integer,Boolean>map =new HashMap<>();
    for (int i = 0; i <nums1.length ;i++) {
             if (!map.containsKey(nums1[i])) map.put(nums1[i],Boolean.TRUE);
    }
    for (int i = 0; i <nums2.length ;i++) {
            if (!map.containsKey(nums2[i])) map.put(nums2[i],Boolean.TRUE);
    }
        ArrayList<Integer>l =new ArrayList<>();
        for(int i:map.keySet()){
                l.add(i);
            }
        System.out.println(l);
        }

}



