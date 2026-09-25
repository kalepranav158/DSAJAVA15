package Practice_Template;

public class stack_all_operations {
    class Stack {
    private int[] stack;
    private int top;
    private int capacity;

    // Constructor
    Stack(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1;
    }


    // Push operation
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + value);
            return;
        }
        stack[++top] = value;
        System.out.println(value + " pushed into stack");
    }

    // Pop operation
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop");
            return -1;
        }
        return stack[top--];
    }

    // Peek operation
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    // isEmpty operation
    public boolean isEmpty() {
        return top == -1;
    }

    // isFull operation
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Size operation
    public int size() {
        return top + 1;
    }

    // Display stack elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}

}
