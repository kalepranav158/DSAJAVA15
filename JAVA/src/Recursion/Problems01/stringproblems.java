package Recursion.Problems01;

public class stringproblems {
    public static void main(String[] args) {
        System.out.println(skipcharacter("","baccdab"));
        System.out.println(skipstring("abcdefxyz"));

    }

    static String skipcharacter(String str2, String ch )
    {    if(ch.isEmpty()) {
             return str2;
          }
     char  c = ch.charAt(0);
     if ( c == 'a')
       return   skipcharacter(str2, ch.substring(1));
     else
         return skipcharacter(str2 + c, ch.substring(1));
    }

     static String skipstring( String original )
    {    if(original.isEmpty()) {
               return  " ";
    }
          if (original.startsWith("xyz")) return  skipstring(original.substring(3));
        else  return  original.charAt(0)+ skipstring(original.substring(1));
       }

  // only skip the something  when it is subset of something
    // just add the condition in the if statement


}
