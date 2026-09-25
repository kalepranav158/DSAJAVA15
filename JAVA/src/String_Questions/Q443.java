package String_Questions;

import java.util.HashMap;

public class Q443 {
    public static void main(String[] args) {

    }


    public static int compress(char[] chars) {
       int i =0;
       int index=0;
       while (i<chars.length){
           char curr= chars[i];
           int cnt =0;
           while (i<chars.length&& chars[i]==curr){
               i++ ;
               cnt++;
           }
               chars[index++]=curr;
              if (cnt>1){
                  String countstr= String.valueOf(cnt);
                  for (char c :countstr.toCharArray()){
                      chars[index++]=c;
                  }

              }
       }

return  index;

        }

        }



