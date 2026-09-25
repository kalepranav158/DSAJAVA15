package Recursion.Problems01;

import java.util.ArrayList;

public class practice {
    public static void main(String[] args) {
        digits("", "23");
        ArrayList<String> ans = digits2("", "23");
        System.out.println(ans);
    }

    static void digits(String ans, String original) {
        if (original.isEmpty()) {
            System.out.println(ans);
            return;
        }

        int digit = original.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            digits(ans + ch, original.substring(1));
        }
    }

    static ArrayList<String> digits2(String ans, String original) {
        if (original.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        ArrayList<String> Ans = new ArrayList<>();
        int digit = original.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            Ans.addAll(digits2(ans + ch, original.substring(1)));
        }

        return Ans;
    }
}