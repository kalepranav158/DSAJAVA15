//package Linked_List_Questions;
//public class MergeKSortedLists {
//
//    /**
//     * Definition for singly-linked list.
//     */
//    static class ListNode {
//        int val;
//        ListNode next;
//
//        ListNode() {}
//
//        ListNode(int val) {
//            this.val = val;
//        }
//
//        ListNode(int val, ListNode next) {
//            this.val = val;
//            this.next = next;
//        }
//    }
//
//    // 🔧 Helper: Create linked list from array
//    public static ListNode buildList(int[] arr) {
//        ListNode dummy = new ListNode(-1);
//        ListNode temp = dummy;
//
//        for (int val : arr) {
//            temp.next = new ListNode(val);
//            temp = temp.next;
//        }
//        return dummy.next;
//    }
//
//    // 🔧 Helper: Print linked list
//    public static void printList(ListNode head) {
//        ListNode temp = head;
//        while (temp != null) {
//            System.out.print(temp.val + " -> ");
//            temp = temp.next;
//        }
//        System.out.println("null");
//    }
//
//    public static void main(String[] args) {
//
//        // ✅ Example 1
//        ListNode[] lists1 = new ListNode[3];
//        lists1[0] = buildList(new int[]{1, 4, 5});
//        lists1[1] = buildList(new int[]{1, 3, 4});
//        lists1[2] = buildList(new int[]{2, 6});
//
//        Solution sol = new Solution();
//        ListNode result1 = sol.mergeKLists(lists1);
//
////        System.out.println("Merged List 1:");
////        printList(result1);
////
////
////        // ✅ Example 2 (empty input)
////        ListNode[] lists2 = new ListNode[0];
////        ListNode result2 = sol.mergeKLists(lists2);
////
////        System.out.println("Merged List 2:");
////        printList(result2);
////
////
////        // ✅ Example 3 (list with empty list)
////        ListNode[] lists3 = new ListNode[1];
////        lists3[0] = null;
////
////        ListNode result3 = sol.mergeKLists(lists3);
////
////        System.out.println("Merged List 3:");
////        printList(result3);
//    }
//
//}
//
//
///**
// * Your Solution Class (DO NOT MODIFY SIGNATURE)
// */
//class Solution {
//    public MergeKSortedLists.ListNode mergeKLists(MergeKSortedLists.ListNode[] lists) {
//        MergeKSortedLists.ListNode result = new MergeKSortedLists.ListNode(Integer.MAX_VALUE);
//
//        for (int i = 0; i < lists.length ; i++) {
//         result = merge(result,lists[i]);
//        }
//         return result;
//    }
//
//    public MergeKSortedLists.ListNode merge(MergeKSortedLists.ListNode list1, MergeKSortedLists.ListNode list2){
//        // Dummy node to simplify logic
//        MergeKSortedLists.ListNode dummy = new ListNode(-1);
//        MergeKSortedLists.ListNode tail = dummy;
//
//        // Traverse both lists
//        while (list1 != null && list2 != null) {
//            if (list1.val < list2.val) {
//                tail.next = list1;   // attach list1 node
//                list1 = list1.next; // move ahead in list1
//            } else {
//                tail.next = list2;   // attach list2 node
//                list2 = list2.next; // move ahead in list2
//            }
//            tail = tail.next; // move tail forward
//        }
//
//        // Attach remaining nodes
//        if (list1 != null) tail.next = list1;
//        if (list2 != null) tail.next = list2;
//
//        // Head is dummy.next
//        return dummy.next;
//
//
//
//
//    }
