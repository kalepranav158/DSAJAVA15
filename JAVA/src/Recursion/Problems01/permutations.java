package Recursion.Problems01;

import java.util.ArrayList;

public class permutations {
    public static void main(String[] args) {
        prm("","abc");
    ArrayList<String> Ans = perms("","abc");
        System.out.println(Ans);
    }


    static  void prm(String ans , String original) {
        if (original.isEmpty())
        {   System.out.println(ans);
            return;
        }

        char ch = original.charAt(0);

        for (int i= 0 ; i<= ans.length();i++)
        {   String first = ans.substring(0,i);
            String second =ans.substring(i,ans.length());
            prm(first+ch+second,original.substring(1));
        }

    }

    static ArrayList<String> perms(String ans, String original) {
        if (original.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        char ch = original.charAt(0);
        ArrayList<String> finalans = new ArrayList<>();
        for (int i = 0; i <= ans.length(); i++) {
            String first = ans.substring(0, i);
            String second = ans.substring(i, ans.length());
            finalans.addAll(perms(first + ch + second, original.substring(1)));


        }
     return finalans ;


    }
}
