package Practice_Template;

public class p2 {

    static class Stack {
        int[] stack;
        int capacity;
        int top;

        public Stack(int capacity) {
            this.capacity = capacity;
            stack = new int[capacity];
            top = -1;
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public boolean isFull() {
            return top == capacity - 1;
        }

        public void push(int val) {
            if (isFull()) {
                System.out.println("Stack Overflow! Cannot insert " + val);
                return;
            }
            stack[++top] = val;
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow! Cannot remove");
                return -1;
            }
            int val = stack[top--];
            System.out.println("Value removed: " + val);
            return val;
        }

        public void peek() {
            if (isEmpty()) {
                System.out.println("Cannot peek, Stack is empty");
                return;
            }
            System.out.println("Element at top: " + stack[top]);
        }

        public void display() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return;
            }
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i] + " |");
            }
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack(5);

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();
        s.peek();
        s.pop();
        s.display();
    }
}
