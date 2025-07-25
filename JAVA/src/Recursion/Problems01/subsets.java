package Recursion.Problems01;

import java.util.ArrayList;

public class subsets {
    public static void main(String[] args) {
        System.out.println(subseq("","abc"));
        asci("","abc");


    }

    static ArrayList<String> subseq(String ans, String original)
    {

        if(original.isEmpty()) {
            ArrayList<String> set = new ArrayList<>() ;
            set.add(ans);
            return set;
    }
        char  c = original.charAt(0);
        ArrayList<String>left =  subseq(ans, original.substring(1));
        ArrayList<String>right =  subseq(ans + c, original.substring(1));
        left.addAll(right);
       return left;
    }


    static ArrayList<String>asci(String ans, String original)
    {
        if(original.isEmpty()) {
            ArrayList<String> set = new ArrayList<>() ;
            set.add(ans);
            return set;
        }
        char  c = original.charAt(0);
        ArrayList<String>first =  subseq(ans, original.substring(1));
        ArrayList<String>second =  subseq(ans + c, original.substring(1));
        ArrayList<String>third =  subseq(ans + (c+0), original.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;


    }
}