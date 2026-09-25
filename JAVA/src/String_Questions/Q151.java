    package String_Questions;

    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.List;

    public class Q151 {
        public static void main(String[] args) {
           String s = "the sky  is blue   ";
            System.out.println(reverseWords(s));
        }
          public static String  reverseWords(String s) {
             String[] s1= s.split(" ");
            String [] arr = new String[s.length()];

            for (int i=0;i<s1.length;i++){
                if (s1[i]!=" ") {
                    arr[i]=s1[i];
                }
            }


              List<String> ans = new ArrayList<>();
              for (int i =arr.length-1;i>-1;i--)
              {
                  ans.add(arr[i]);
              }

              return ans.toString();
            }
        }

