package comparing;

import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        student a = new student(1, 99.5);
        student b = new student(2, 96.19);
        student c = new student(3, 92.55);
        student d = new student(4, 96.99);
        student e = new student(5, 62.55);
        student f = new student(6, 78.99);
        
       student [] list ={a,b,c,d,e,f};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

    }

}
