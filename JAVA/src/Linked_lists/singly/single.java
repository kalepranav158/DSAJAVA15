package Linked_lists.singly;

import org.w3c.dom.Node;

public class single {
    public node head;
    public node tail;
    private int size;

    public single() {
        this.size = 0;
    }

    public class node {
        int val;
        node next;

        public node() {
        }

        public node(int val) {
            this.val = val;
            size++;
        }

        public node(int val, node next) {
            this.val = val;
            this.next = next;
            size++;
        }


    }

    public void insert_first(int val) {
        node Node = new node(val);
        Node.next = head;
        head = Node;
        if (tail == null) tail = head;

    }

    public void insert_last(int val) {
        node Node = new node(val);
        tail.next = Node;
        tail = Node;
        if (tail == null) insert_first(val);
    }


    public void insert_at_index(int val, int index) {
        if (index == 0) insert_first(val);
        if (index == size) insert_last(val);

        node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        node that = new node(val, temp.next);
        temp.next = that;

    }

    public void delete_first() {
        System.out.println("Removed:" + head.val);
        head = head.next;
        if (head == null) tail = null;
        size--;
    }


    public node ref(int index) {
        node temp = head;
        for (int i = 0; i < index; i++) temp = temp.next;
        return temp;


    }

    public void delete_last() {
        node refer = ref(size - 2);
        tail = refer.next;
        tail.next = null;
        size--;

    }


    public node find(int val) {
        node temp = head;
        while (temp != null)
            if (temp.val != val) return temp;
        temp = temp.next;
        return null;
    }


    public int delete_at_index(int index) {
        if (index == 0) delete_first();
        if (index == size - 1) delete_last();

        node prev = ref(index - 1);
        int val = prev.val;

        prev.next = prev.next.next;
        return val;

    }


    public void display() {
        node temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }

    }


    // insert using recursion
    public void insert_rec(int val, int index) {
        head = insert_rec(val, index, head);

    }

    private node insert_rec(int val, int index, node new_node) {
        if (index == 0) {
            node temp = new node(val);
            temp.next = new_node;
            size++;
            return temp;
        }
        new_node.next = insert_rec(val, index - 1, new_node.next);
        return new_node;
    }


    // Q1: Delete duplicates from a sorted linked list
    public void delete_duplicate() {
        head = delete_duplicate(head);
    }

    private node delete_duplicate(node current) {
        // Base case: if list is empty OR only one node, nothing to delete
        if (current == null || current.next == null) {
            return current;
        }

        if (current.val == current.next.val) {
            // Skip duplicate node
            current.next = current.next.next;
            // Call again on same node to check further duplicates
            return delete_duplicate(current);
        } else {
            // Otherwise, move forward
            current.next = delete_duplicate(current.next);
            return current;
        }
    }


    // Q876
    public node middle(node head) {
        node f = head;
        node s = head;

        while (s != null && f.next != null) {
            s = s.next;
            f = f.next;


        }
        return s;
    }


// Q148 sort linked list


    // Q148: Sort Linked List using Merge Sort
    public node sortList(node head) {
        // Base case: empty or single node
        if (head == null || head.next == null) {
            return head;
        }

        // Step 1: Find the middle node
        node mid = getMiddle(head);
        node rightHead = mid.next;
        mid.next = null;  // split into two halves

        // Step 2: Recursively sort both halves
        node left = sortList(head);
        node right = sortList(rightHead);

        // Step 3: Merge sorted halves
        return merge(left, right);
    }

    // Helper to get middle (fast & slow pointer)
    private node getMiddle(node head) {
        node slow = head, fast = head.next; // fast starts ahead for proper split
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Merge two sorted linked lists
    public node merge(node one, node two) {
        node dummy = new node(0); // temporary node
        node tail = dummy;

        while (one != null && two != null) {
            if (one.val <= two.val) {
                tail.next = one;
                one = one.next;
            } else {
                tail.next = two;
                two = two.next;
            }
            tail = tail.next;
        }

        // Attach remaining nodes
        if (one != null) {
            tail.next = one;
        }
        if (two != null) {
            tail.next = two;
        }

        return dummy.next; // merged list starts at dummy.next
    }


// Q 206 Reversing a linked List

    public static node reverse(node head) {
        node present = head;
        node next = present.next;
        node prev = null;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) next = next.next;

        }

        head = prev;
        return head;


    }


    public node reversebetween(node head, int left, int right) {
        if (head == null || left == right) return head;

        node dummy = new node(0);
        dummy.next = head;
        node prev = dummy;

        // Step 1: Move prev to the node before 'left'
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        // Step 2: Start and then node for reversal
        node start = prev.next;
        node then = start.next;

        // Step 3: Reverse nodes between left and right
        for (int i = 0; i < right - left; i++) {
            start.next = then.next;
            then.next = prev.next;
            prev.next = then;
            then = start.next;
        }

        return dummy.next;
    }


    // Q234 pallindrome check
    public boolean pallindrome(node head) {
        node mid = middle(head);
        node rev = reverse(mid);
        node rerev = rev;

        // compare both halves
        while (head != null && rev != null) {
            if (head.val != rev.val) break;

            head = head.next;
            rev = rev.next;

        }

        reverse(rerev);

        return (head == null || rev == null);

    }

    // Q143 Reorder List
    public void reoreder(node head)
    {
        if (head==null||head.next==null) return;
        node hf =head;
        node mid = middle(head);
        node hs = reverse(mid);

        while (hf!=null&&hs!=null)
        {
            node temp= hf.next;
            hf.next=hs;
            hf=temp;

            temp=hs.next;
            hs.next=hf;
            hs=temp;

            if (hf!=null) hf.next=null;
        }

    }


//    // Q25 Reverse nodes in k group
//    public  node reversekgroup(node head,int k ){
//        public ListNode reverseKGroup(ListNode head, int k) {
//            if (head == null || k == 1) return head;
//
//            // Dummy node to simplify edge cases
//            ListNode dummy = new ListNode(0);
//            dummy.next = head;
//
//            ListNode prevGroupEnd = dummy;
//            ListNode curr = head;
//
//            // Count total nodes
//            int count = 0;
//            while (curr != null) {
//                count++;
//                curr = curr.next;
//            }
//
//            // Repeat reversal for each group of k
//            while (count >= k) {
//                ListNode groupStart = prevGroupEnd.next;
//                ListNode nextGroupStart = groupStart.next;
//
//                // Reverse k nodes
//                for (int i = 1; i < k; i++) {
//                    groupStart.next = nextGroupStart.next;
//                    nextGroupStart.next = prevGroupEnd.next;
//                    prevGroupEnd.next = nextGroupStart;
//                    nextGroupStart = groupStart.next;
//                }
//
//                // Move prevGroupEnd to end of this group
//                prevGroupEnd = groupStart;
//                count -= k;
//            }
//
//            return dummy.next;
//        }}

}










