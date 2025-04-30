package Basics;

import java.util.Scanner;



public class Swtch
 {  public static void main(String[] args)
     {
         Scanner sc = new Scanner(System.in);

       System.out.println("Enter any Fruit name:");
       String fruit = sc.next();
       
       switch(fruit)

       { case "mango"->System.out.println("M for mango");
        case "banana"->System.out.println("B for banana");
        case "apple"->System.out.println("A for Apple");
        default->System.out.println("Dont You know the names:");
        
      }




 }    
    
}
