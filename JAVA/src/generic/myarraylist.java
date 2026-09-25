package generic;

import java.util.ArrayList;
import java.util.Arrays;

public class myarraylist<T> {

    private Object[] x;
    private static int DEFAULT_SIZE = 5;
    private int size = 0;

    public myarraylist() {
        this.x = new Object[DEFAULT_SIZE];
    }

    public void add(int num) {
        if (isfull(x)) {
            resize();
        }
        x[size++] = num;


    }

    @Override
     public String toString()
    {
    return Arrays.toString(x) ;
    }
   public boolean isfull(Object[] x)
   {  return size==x.length;

   }
   private void resize(){
       Object [] temp = new Object[x.length*2];
        for(int i =0; i<x.length;i++)
        {    temp[i]=x[i];
        }
        x = temp;


   }
   public static void main(String[] args) {
//     myarraylist x = new myarraylist();
//     x.add(5);
//     x.add(6);
//       x.add(54);
//       x.add(95);
//       x.add(5);
//       x.add(6);
//       x.add(54);
//       x.add(95);
//       System.out.println(Arrays.toString(x.x));
//
//       ArrayList list = new ArrayList(); // here you can give any datatype without declaring the datatpe of list
//       list.add("Pranav");
//       list.add(124);
//       System.out.println(list);

        myarraylist<Integer>list2 =  new myarraylist<>();
        list2.add(494);
        list2.add(464);
       System.out.println(list2);

   }


}
