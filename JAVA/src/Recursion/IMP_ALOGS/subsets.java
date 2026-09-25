package Recursion.IMP_ALOGS;

import java.util.ArrayList;

public class subsets {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        // temporary list to store current subset
        ArrayList<Integer> current = new ArrayList<>();

        print(arr, current, 0, result);

        System.out.println("\nAll subsets:");
        System.out.println(result);
    }

    public static void print(int[] arr, ArrayList<Integer> current, int i,
                             ArrayList<ArrayList<Integer>> result) {

        // Base case
        if (i == arr.length) {
            result.add(new ArrayList<>(current)); // store copy
            return;
        }

        // 1. Include element
        current.add(arr[i]);
        print(arr, current, i + 1, result);

        // Backtrack
        current.remove(current.size() - 1);

        // 2. Exclude element
        print(arr, current, i + 1, result);
    }
}