package Practice;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class BFS {

    public static void bfs(Node root) {
        if (root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        int levelNum = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            System.out.println("Level " + levelNum + ":");

            for (int i = 0; i < size; i++) {
                System.out.println("---- Iteration " + i + " START ----");

                Node temp = q.poll();

                System.out.print("Processing " + temp.val + "  ");

                if (temp.left != null) {
                    System.out.print("(Insert Left " + temp.left.val + ") ");
                    q.offer(temp.left);
                }

                if (temp.right != null) {
                    System.out.print("(Insert Right " + temp.right.val + ") ");
                    q.offer(temp.right);
                }

                System.out.println();

                // 🔴 Mark end of one iteration
                System.out.println("---- Iteration " + i + " END ----\n");
            }

            levelNum++;
            System.out.println("========================\n");
        }
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);

        bfs(root);
    }
}