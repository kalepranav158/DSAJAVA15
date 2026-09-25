package Binray_trees;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Binary_trees {

    private static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
        }
    }

    private Node root;

    // Insert nodes in the tree
    public void populate(Scanner scanner) {
        System.out.print("Enter root node value: ");
        int val = safeIntInput(scanner);
        root = new Node(val);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node) {
        // Left child
        if (askYesNo(scanner, "Do you want to add LEFT child of " + node.val + "? (y/n): ")) {
            System.out.print("Enter value for left child of " + node.val + ": ");
            int value = safeIntInput(scanner);
            node.left = new Node(value);
            populate(scanner, node.left);
        }

        // Right child
        if (askYesNo(scanner, "Do you want to add RIGHT child of " + node.val + "? (y/n): ")) {
            System.out.print("Enter value for right child of " + node.val + ": ");
            int value = safeIntInput(scanner);
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }

    // Basic display (your original)
    public void display() {
        System.out.println("\nBinary Tree Structure:");
        display(root, "");
    }

    private void display(Node node, String indent) {
        if (node == null) return;
        System.out.println(indent + "• " + node.val);
        display(node.left, indent + "   ");
        display(node.right, indent + "   ");
    }

    // NEW: Pretty Display with tree branching
    public void prettyDisplay() {
        System.out.println("\nPretty Tree View:");
        prettyDisplay(root, "", true);
    }

    private void prettyDisplay(Node node, String prefix, boolean isTail) {
        if (node == null) return;

        System.out.println(prefix + (prefix.equals("") ? "" : (isTail ? "└── " : "├── ")) + node.val);

        if (node.left != null || node.right != null) {
            if (node.left != null)
                prettyDisplay(node.left, prefix + (isTail ? "    " : "│   "), node.right == null);

            if (node.right != null)
                prettyDisplay(node.right, prefix + (isTail ? "    " : "│   "), true);
        }
    }

    // Safe integer input
    private int safeIntInput(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.print("Invalid input. Enter number: ");
                scanner.next();
            }
        }
    }

    // Yes/No input
    private boolean askYesNo(Scanner scanner, String message) {
        while (true) {
            System.out.print(message);
            String input = scanner.next().trim().toLowerCase();

            if (input.equals("y") || input.equals("yes")) return true;
            if (input.equals("n") || input.equals("no")) return false;

            System.out.println("Enter y/n only.");
        }
    }
}
