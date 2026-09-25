package Practice_Template;

public class p1 {
    class Node{
        int val;
         Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public p1() {
        head=tail=null;
        size=0;
    }


    // ---------Insertion operation----------------


    public void insert_first(int val ){
        Node new_node = new Node(val);
        new_node.next=head;
        head=new_node;
        if (tail==null) tail=head;
        size++;
    }

    public void insert_last(int val){
        Node new_node =new Node(val);
        if (tail==null) {head=tail=new_node;}
        else {
            tail.next =new_node;
            tail=new_node;
        }
        size++;
    }
    public void insert_at(int idx,int val) {

        if (idx < 0 || idx > size) throw new IndexOutOfBoundsException("Invalid Index");
        if (idx == 0) insert_first(val);
        if (idx == size) insert_last(val);

        Node prev = get_node(idx-1);
        Node node = new Node(val);
        prev.next=node.next;
        prev.next=node;
        size++;
    }

    public Node get_node(int index){
        Node curr= head;
        for (int i =0; i<index;i++){
            curr=curr.next;
        }
       return curr;
    }


    //-------------------Deletion Operation------------------------//
    public int delte_first(){
        int val= head.val;
        if (isEmpty()) throw new IllegalStateException("List is Empty");
        head=head.next;
        if (head==null){ tail=null;}
        size--;
    return val;
    }

    public int delete_last(){
        int val= tail.val;
        Node prev = get_node(size-2);
        prev.next=null;
        tail=prev;
    return val;}
    private boolean isEmpty() {return size==0;}


    public int delte_at_idx(int idx){

        if (idx==0) delte_first();
        if (idx==size) delete_last();

        Node prev= get_node(idx-1);
        int val = prev.next.val;
        prev.next=prev.next.next;
        size--;
        return val;}


    // find Index Function
    public int indexof(int key){

      int idx=0;
        for (Node curr =head;curr!=null;curr=curr.next) {
            if (curr.val == key) return idx;
            idx++;
        }
        return -1;
    }

}
