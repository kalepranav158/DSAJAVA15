package TCS_Practice.Leetcodes;
import java.util.Scanner;
public class Longest_pallindrome_subbstring {

    public static String is_pallindrome(String s){
        if(s==null||s.length()<0) return "";
        int start =0;
        int end = 0;

        for(int i =0;i<s.length();i++){
            int  l1 = expand(s,i,i);
            int  l2 = expand (s,i,i+1);
            int len = Math.max(l1,l2);

            if(len>end-start){
                start = i- (len-1)/2    ;
                end = i+ len/2;
            }
        }
        return s.substring(start ,end +1);
        }

        private static int expand(String s , int left ,int right){
        while(left>=0&& right <s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right -left -1;}

       public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string to give longest Pallindrome");
        if(sc.hasNextLine()){
            String input = sc.nextLine();


        String ans = is_pallindrome(input);
        System.out.println(ans);
        }

    }


}

