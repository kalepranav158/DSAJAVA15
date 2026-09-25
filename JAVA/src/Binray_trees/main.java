package Binray_trees;

import java.util.Scanner;

public class  main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Binary_trees tree = new Binary_trees();
//
//        tree.populate(sc);
//
//        tree.display();          // Normal structure view
//        tree.prettyDisplay();    // Pretty view with lines
//

     Scanner sc = new Scanner(System.in);
     BST tree =new BST();

     int [] nums ={ 5,1,4,7,8,2};
     tree.populate(nums);
     tree.display( );

    }

}