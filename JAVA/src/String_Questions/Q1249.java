package String_Questions;

import java.util.*;

public class Q1249 {
    public static void main(String[] args) {
     String s ="lee(t(c)o)de)";


        System.out.println(minRemoveToMakeValid(s));

    }

    public static String minRemoveToMakeValid(String s) {

        Set<Integer> ans = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(c == '('){
                stack.push(i);
            }
            else if(c == ')'){
                if(!stack.isEmpty()){
                    stack.pop();
                }else{
                    ans.add(i);
                }
            }
        }

        while(!stack.isEmpty()){
            ans.add(stack.pop());

        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i <s.length() ; i++) {
            if(!ans.contains(i)){
            result.append(s.charAt(i));

            }
        }

       return  result.toString();
    }


    public static String minRemoveToMakeValid2(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }
        StringBuilder builder = new StringBuilder();
        int open = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                builder.append(c);
                open++;
            } else if (c == ')') {
                // skip extra ')'
                if (open > 0) {
                    builder.append(c);
                    open--;
                }
            } else {
                builder.append(c);
            }
        }
        if (open == 0) {
            return builder.toString();
        }

        // remove out of band '('
        for (int i = builder.length() - 1; i >= 0; i--) {
            if (open > 0 && builder.charAt(i) == '(') {
                builder.deleteCharAt(i);
                open--;
            }
        }
        return builder.toString();
    }


}
