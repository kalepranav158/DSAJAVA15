//package Linked_List_Questions;
//
//import java.util.List;
//
//public class Q203 {
//    public class ListNode {
//      int val;
//      ListNode next;
//      ListNode() {}
//      ListNode(int val) { this.val = val; }
//      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//    }
//
// public static void main(String[] args) {
//     removeElements();
// }
//
//
//        public static ListNode removeElements(ListNode head, int val) {
//            ListNode curr =head;
//            while (curr.next.next!=null){
//                if (curr.next.val == val){
//                    curr=curr.next.next;
//                }
//               else
//                   curr = curr.next;
//            }
//            return  head;
//        }
//    }
//}
