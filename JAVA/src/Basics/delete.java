package Basics;

import java.util.Scanner;


public class delete {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in) ;
    
    System.out.println("Eneter the first String ");
    String  s1 =in.next();
    System.out.println("Enter second String");
    String s2 = in.next();

    
    if(s1.equalsIgnoreCase(s2))
    {   System.out.println("The string are Equal ");}
    else
    {  System.out.println("the strings are not equal");
    
    }

    }
    
}
