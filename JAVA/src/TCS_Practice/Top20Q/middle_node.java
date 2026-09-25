package TCS_Practice.Top20Q;
import java.util.Scanner;
public class middle_node {
    static class Node{
        Node next;
        int val;

        public Node(int val){
            this.val=val;
            this.next=null;
        }
    }

    static Node findMiddle(Node head){
        Node fast=head;
        Node slow= head;

        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow.next;
    }
    static Node head;

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[]= new int[n];

        for(int x:arr){
            Node node = new Node(x);
            if(head==null)  head=node;
           Node temp = head;
           while(temp!=null){
               temp=temp.next;
           }
           temp=node;
        }
    }
}
