package Linked_lists.singly;


import org.w3c.dom.Node;

public class main{

    public static single merge(single first, single second) {
        single ans = new single();
        single.node f = first.head;
        single.node s = second.head;

        while (f != null && s != null) {
            if (f.val < s.val) {
                ans.insert_last(f.val);
                f = f.next;
            } else {
                ans.insert_last(s.val);
                s = s.next;
            }
        }
        while (f != null) {
            ans.insert_last(f.val);
            f = f.next;
        }
        while (s != null) {
            ans.insert_last(s.val);
            s = s.next;
        }

        return ans;
    }

    // Q141 Has cycle
    public static boolean hasCycle(single mlist) {
        if (mlist.head == null) return false;

        single.node slow = mlist.head;
        single.node fast = mlist.head;

        while (fast != null && fast.next != null) {
            slow = slow.next;          // move by 1
            fast = fast.next.next;     // move by 2

            if (slow == fast) {
                return true;           // cycle detected
            }
        }

        return false;  // reached end, no cycle
    }

    // Calculate cycle length from meeting node
    private static int length_Cycle_from_node(single.node slow) {
        int size = 1;
        single.node temp = slow.next;
        while (temp != slow) {
            size++;
            temp = temp.next;
        }
        return size;
    }

    // Detect cycle start node
    public static single.node detect_cycle(single mlist) {
        if (mlist.head == null) return null;

        single.node slow = mlist.head;
        single.node fast = mlist.head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                int length = length_Cycle_from_node(slow);

                // find start of cycle
                single.node first = mlist.head;
                single.node second = mlist.head;

                // move second ahead by 'length' steps
                for (int i = 0; i < length; i++) {
                    second = second.next;
                }

                // move both until they meet
                while (first != second) {
                    first = first.next;
                    second = second.next;
                }

                return first; // start of cycle
            }
        }
        return null; // no cycle
    }

    // Q 876








    //Q202 Happy Number:
    public boolean happy_number(single temp ,int val)
    {
           if (val==1) return  true;
           if (hasCycle(temp)) return false;

        int sum = 0;
        int x = val;

        while (x > 0) {
            int digit = x % 10;         // extract last digit
            sum += digit * digit;          // add square of digit
            x = x / 10;              // remove last digit
        }
   return  false;
    }





    public static void main(String[] args) {
        single node = new single();

        node.insert_first(0);
        node.insert_last(1);
        node.insert_last(1);
        node.insert_last(2);
        node.insert_last(2);
        node.insert_last(3);
        node.insert_last(4);

        node.insert_rec(2, 4);
        System.out.println("Before Reversing :");
        node.display();
        System.out.println("After Reversing :");
        node.reverse(node.head);
        node.display();
    }
}
