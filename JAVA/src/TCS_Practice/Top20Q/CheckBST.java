package TCS_Practice.Top20Q;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CheckBST {

    // Definition of a Binary Tree Node
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    // High-efficiency validation routine running in O(N) Time and O(H) Space
    public static boolean isValidBST(TreeNode root) {
        // Enforce 64-bit Long boundaries to bypass integer value overflow traps
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private static boolean validate(TreeNode node, long min, long max) {
        if (node == null) {
            return true;
        }

        // A node's value must strictly respect its logical upper and lower ancestral boundaries
        if (node.val <= min || node.val >= max) {
            return false;
        }

        // Recursively validate child paths updating bounds seamlessly
        return validate(node.left, min, node.val) && validate(node.right, node.val, max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Guard against entirely missing or empty input streams
        if (!sc.hasNextLine()) {
            System.out.print("INVALID INPUT");
            return;
        }

        String inputLine = sc.nextLine().trim();
        if (inputLine.isEmpty()) {
            System.out.print("INVALID INPUT");
            return;
        }

        // Tokenize space-separated elements dynamically
        String[] tokens = inputLine.split("\\s+");

        if (tokens.length == 0 || tokens[0].equalsIgnoreCase("null")) {
            System.out.print("INVALID INPUT");
            return;
        }

        TreeNode root;
        try {
            // Build the Binary Tree from Level Order Sequence using a tracking Queue
            root = new TreeNode(Integer.parseInt(tokens[0]));
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);

            int i = 1;
            while (!queue.isEmpty() && i < tokens.length) {
                TreeNode current = queue.poll();

                // Process Left Child
                if (i < tokens.length) {
                    if (!tokens[i].equalsIgnoreCase("null")) {
                        current.left = new TreeNode(Integer.parseInt(tokens[i]));
                        queue.add(current.left);
                    }
                    i++;
                }

                // Process Right Child
                if (i < tokens.length) {
                    if (!tokens[i].equalsIgnoreCase("null")) {
                        current.right = new TreeNode(Integer.parseInt(tokens[i]));
                        queue.add(current.right);
                    }
                    i++;
                }
            }
        } catch (NumberFormatException e) {
            System.out.print("INVALID INPUT");
            return;
        }

        // Execute core algorithm and format output explicitly as required
        if (isValidBST(root)) {
            System.out.print("TRUE");
        } else {
            System.out.print("FALSE");
        }
    }
}