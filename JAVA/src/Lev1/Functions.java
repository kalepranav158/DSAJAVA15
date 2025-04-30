package Lev1;
import java.util.Arrays;
import java.util.Scanner;
public class Functions {
    public static void main(String[] args) {
     Scanner in =new Scanner(System.in); 
     /*System.out.println("Enter first number");
     int a=in.nextInt();  
     System.out.println("Enter second number");
     int b=in.nextInt(); */  
     
    
   /* String s2 = mygreat("Hey pranav");
    System.out.println(s2);   */ 

  /*  int x=10;
    int y=20;
    int z=90;
    System.out.println(x+ " " +y+ " "+z);
     swap(x,y);
    System.out.println(x+ " " +y+ " "+z);
    
    */
    int arr[] = {1,3,4,5,6,7,8,9,10,33};
    change(arr);
    System.out.println(Arrays.toString(arr));

   in.close();

}
      static void change(int arr[])
      {  
          arr[2]=3000;
      }





    /*static String mygreat(String s2)
    {
        return s2 ;
    } */


   /*public static void sum(int a,int b,int c)
   {   a=50;
       b=60; 
       c=100;
       

    }
 */
  

}
