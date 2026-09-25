package Linked_lists.singly;

public class doubly {
    private node head;
    private node tail;
    private int size;


    public class node {
        int val;
        node next;
        node prev;

        public node(int val) {
            this.val = val;
        }

        public node(int val, node next, node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
            size++;
        }
    }


    public void insert_first(int val) {
        node Node = new node(val);
        Node.next = head;
        Node.prev = null;
        if (head != null) head.prev = Node;
        head = Node;
        if (tail == null) tail = head;

    }


    public void display() {
        node start = head;
        node last =null;
        while (start != null) {
            System.out.println(start.val);
            start = start.next;
            }

    }

        public void display_rev() {
            node last1 =tail;
            while (last1 != null) {
                System.out.println(last1.val);
                last1 = last1.prev;

            }
    }

        public void insert_last(int val){

                node temp= head;
                while (temp.next!=null) temp=temp.next;
                node new_node = new node(val);
                new_node.next=null;
                temp.next = new_node;
                new_node.prev= temp;
    }

    public void insert_at_index(int val,int index)
    {
        if (index==0) insert_first(val);
        if (index==size) insert_last(val);

        node temp =head;
        for (int i =1 ;i<index;i++)
        { temp=temp.next ;}

        node that = new node(val,temp.next,temp.prev);
        that.next=temp.next;
        temp.next =that;
        that.prev=temp;
        that.next.prev=that;

    }



}


