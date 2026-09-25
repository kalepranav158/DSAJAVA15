package String_Questions;

public class Q520 {
    public static void main(String[] args) {
    String s = "FlaG";
        System.out.println(detectCapitalUse(s));
    }
    public static boolean detectCapitalUse(String word) {

        char[] c = word.toCharArray();
        int index = 0;
        if (c[index]==Character.toUpperCase(c[index])){
          index++;
          if (c[index]==Character.toLowerCase(c[index])){
           while (index<c.length){
               if (c[index]==Character.toLowerCase(c[index])) {
                     index++;
                   return true;
               }
           }
          }
           else
              while (index<c.length){
                  if (c[index]==Character.toUpperCase(c[index])){
                      index++;
                      return true;
                  }
          }
        }
         else {
            index++;
            if (c[index] == Character.toLowerCase(c[index])) {
                while (index < c.length) {
                    if (c[index] == Character.toLowerCase(c[index])) {
                        index++;
                        return true;
                    }
                }
            }
        }
return  false;
    }
}
