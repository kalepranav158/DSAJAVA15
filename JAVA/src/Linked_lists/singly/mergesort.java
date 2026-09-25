package Linked_lists.singly;

public class mergesort {


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
}
