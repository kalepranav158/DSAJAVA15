package comparing;

import java.util.ArrayList;
import java.util.function.Consumer;

public class lambdafunctions {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0;i<5;i++)
            list.add(i*2);


        Consumer<Integer> fun  = (item)-> System.out.println(item);
        list.forEach(fun);
      int p = 5;
      int q =10;
       operation sum =(a, b) ->a+b;
        operation prod =(a, b) ->a*b;
        operation div =(a, b) ->a/b;
        operation sub =(a, b) ->a-b;
    lambdafunctions lm = new lambdafunctions();
        System.out.println();
       System.out.println( lm.operate(p,q,sum));
        System.out.println(lm.operate(p,q,prod));
        System.out.println(lm.operate(p,q,sub));
        System.out.println(lm.operate(p,q,div));




    }

       private int operate(int a,int b,operation o){
        return o.operat(a,b);
       }


    int sum(int a,int b){
        return a+b;
    }


interface operation{
        int operat(int a,int b);

}




}
