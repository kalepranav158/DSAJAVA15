package TCS_Practice.Top20Q;
import java.util.Scanner;
public class Remove_dup_from_linked {
   static class Node{
       Node next ;
       int val;
       public Node (int val){
           this.val=val;
           this.next=null;
       }
   }
   static Node head;
   static Node tail;


    public static Node remove_dup(Node head){
        if(head==null||head.next==null) return head;
        Node temp = head;
        while(temp!=null&&temp.next!=null){
            if(temp.val== temp.next.val){
                temp.next=temp.next.next;
            }
            else temp=temp.next;
        }

    return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Guard against completely empty or invalid stream inputs
        if (!sc.hasNextLine()) {
            System.out.print("INVALID INPUT");
            return;
        }

        String inputLine = sc.nextLine().trim();
        if (inputLine.isEmpty()) {
            System.out.print("INVALID INPUT");
            return;
        }

        // Tokenize space-separated elements dynamically
        String[] tokens = inputLine.split("\\s+");

        Node head = null;
        Node tail = null;

        // Build the Linked List in optimized O(N) time using a tail tracking reference
        for (String token : tokens) {
            try {
                int value = Integer.parseInt(token);
                Node newNode = new Node(value);

                if (head == null) {
                    head = newNode;
                    tail = newNode;
                } else {
                    tail.next = newNode;
                    tail = newNode; // Move the tail pointer forward
                }
            } catch (NumberFormatException e) {
                // If a non-integer token passes through, handle it cleanly
                System.out.print("INVALID INPUT");
                return;
            }
        }

    }
}
