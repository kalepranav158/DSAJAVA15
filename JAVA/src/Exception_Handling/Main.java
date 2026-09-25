package Exception_Handling;

import java.lang.module.FindException;

public class Main {
    public static void main(String[] args) {
        int a =5;
        int b =0;
        try {
            String name = "Pranav";
            if (name.equals("Pranav")) throw new MyExceptions("My Name is Pranav");
        }
        catch (MyExceptions e) { System.out.println(e.getMessage());}
        catch (Exception e){System.out.println(e.getMessage());}
        finally {
            System.out.println("This will Always run");
        }
    }
   static int divide(int  a,int b){
        if (b==0) throw new ArithmeticException("Please do not divide by zero");
        return a/b;
    }



}
