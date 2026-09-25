package Array_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q977 {

    public static void main(String[] args) {
        int[] arr = {-4, -1, 0, 3, 10};
        System.out.println(Arrays.toString(helper(arr)));
    }

    public static int[] helper(int[] arr) {

        List<Integer> neg_arr = new ArrayList<>();
        List<Integer> pos_arr = new ArrayList<>();

        // separate and square
        for (int x : arr) {
            if (x < 0) {
                neg_arr.add(x * x);
            } else {
                pos_arr.add(x * x);
            }
        }

        // reverse neg_arr because squares are in descending order
        int i = 0, j = neg_arr.size() - 1;
        while (i < j) {
            int temp = neg_arr.get(i);
            neg_arr.set(i, neg_arr.get(j));
            neg_arr.set(j, temp);
            i++;
            j--;
        }

        // merge two sorted lists
        int[] ans = new int[arr.length];
        int p1 = 0, p2 = 0, k = 0;

        while (p1 < neg_arr.size() && p2 < pos_arr.size()) {
            if (neg_arr.get(p1) <= pos_arr.get(p2)) {
                ans[k++] = neg_arr.get(p1++);
            } else {
                ans[k++] = pos_arr.get(p2++);
            }
        }

        while (p1 < neg_arr.size()) {
            ans[k++] = neg_arr.get(p1++);
        }

        while (p2 < pos_arr.size()) {
            ans[k++] = pos_arr.get(p2++);
        }

        return ans;
    }
}
