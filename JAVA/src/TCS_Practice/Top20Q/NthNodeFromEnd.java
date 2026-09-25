package TCS_Practice.Top20Q;

import java.util.Scanner;

public class NthNodeFromEnd {

    // Definition of a Singly Linked List Node
    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Your pure Floyd's Cycle Detection logic running in O(M) Time and O(1) Space
    public static boolean detect(Node head) {
        if (head == null || head.next == null) {
            return false;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true; // Loop discovered
            }
        }
        return false; // Safely reached the tail without a loop
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Guard against an empty or missing standard input stream
        if (!sc.hasNextLine()) {
            System.out.print("INVALID INPUT");
            return;
        }

        // Parse Line 1: Space-separated linked list elements
        String listLine = sc.nextLine().trim();
        if (listLine.isEmpty()) {
            System.out.print("INVALID INPUT");
            return;
        }

        // Parse Line 2: The integer index value connection (stored to safely clear stream buffers)
        if (!sc.hasNextInt()) {
            System.out.print("INVALID INPUT");
            return;
        }
        int pos = sc.nextInt();

        // Tokenize and build the Linked List dynamically
        String[] tokens = listLine.split("\\s+");
        Node head = null;
        Node tail = null;

        // Array to easily look up nodes by index to recreate the loop in code memory
        Node[] nodesTrack = new Node[tokens.length];
        int idx = 0;

        for (String token : tokens) {
            try {
                int value = Integer.parseInt(token);
                Node newNode = new Node(value);
                nodesTrack[idx++] = newNode;

                if (head == null) {
                    head = newNode;
                    tail = newNode;
                } else {
                    tail.next = newNode;
                    tail = newNode;
                }
            } catch (NumberFormatException e) {
                System.out.print("INVALID INPUT");
                return;
            }
        }

        // Reconstruct the internal cycle loop connection based on standard TCS console variables
        if (pos >= 0 && pos < tokens.length && tail != null) {
            tail.next = nodesTrack[pos];
        }

        // Invoke your corrected method routine
        boolean hasLoop = detect(head);

        if (hasLoop) {
            System.out.print("TRUE");
        } else {
            System.out.print("FALSE");
        }
    }
}