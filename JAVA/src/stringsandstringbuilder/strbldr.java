package stringsandstringbuilder;

import java.util.ArrayList;

public class strbldr {
    public static void main(String[] args) {
//        String a = "Pranav";
//        String b = "Pranav";
//        System.out.println(a==b);
//        System.out.println(a + " "+b );
//        b="Rutuja"; // this is creatiig a new object
//        System.out.println(b);

         String a = new String("Pranav");
        String b = new String("Pranav");
        System.out.println(" == "+a==b);
        System.out.println(".equals "+a.equals(b));

float f = 3.216161f;

// operators: only defined on premitives and complex objects (in case of complex objects at least one string needed)
        System.out.println("x" +3);
        System.out.println(new Integer(5) + "" +new ArrayList<>());

        for (int i =0 ; i < 26 ;i++) System.out.println(  (char)('a'+i));// complexity is n^2 which is not good





    }
}
