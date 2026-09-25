package Linked_lists.singly;

public class cc {
    node head;
    node tail;
    int val;

    class node {
        int val;
        node next;

        public node(int val){
            this.val=val;
            this.next=null;
        }
    }

    // Insert at the end
    public void insert(int val) {
        node newNode = new node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head; // circular link
            return;
        }
        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }

    // Display the list
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        node temp = head;
        do {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to head)");
    }

    public void delete(int val) {
       node temp= head;
       if (temp==null) return;

       if (temp.val==val) {
           head = head.next;
           tail.next = head;
           return;
       }

       do {
           node n = temp.next;
          if (n.val==val)
          { temp.next=n.next;
           break;
          }
          temp=temp.next;
       } while( temp!=head);

}




}
