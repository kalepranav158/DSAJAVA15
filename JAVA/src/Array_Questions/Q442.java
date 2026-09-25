package Array_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Q442 {
    public static void main(String[] args) {
        int [] nums={4,3,2,7,8,2,3,1};

        List<Integer> ans = new ArrayList<>();
        HashSet<Integer> map = new HashSet<>();
        for (int i = 0; i < nums.length ; i++) {
            if (map.contains(nums[i])) {ans.add(nums[i]);}
            else map.add(nums[i]);
        }
        System.out.println(ans);

    }
}
