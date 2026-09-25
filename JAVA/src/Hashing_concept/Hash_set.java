package Hashing_concept;
import java.util.HashSet;
import java.util.Iterator;

public class Hash_set {
    public static void main(String[] args) {
    HashSet <Integer> set = new HashSet<>();
    // insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        // search
       if (set.contains(3)) System.out.println("Contains 3");
       if (set.contains(10)) System.out.println("Contains 10");
       // delete
        set.remove(3);
        if (set.contains(3)) System.out.println(" contains 3");

        // iterator
        Iterator it = set.iterator();
        System.out.println(it.next());
        System.out.println(it.hasNext());
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(it.hasNext());



    }
}
