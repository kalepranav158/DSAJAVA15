package stacks;

public class Stack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    protected int ptr = -1;

    public Stack() {
        this(DEFAULT_SIZE);
    }

    public Stack(int userSize) {
        this.data = new int[userSize];
    }

    public boolean push(int val) throws Exception {
        if (isFull()) {
            throw new Exception("Cannot push, stack is full!");
        }
        data[++ptr] = val;
        return true;
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot pop from an empty stack!");
        }
        return data[ptr--];
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot peek from an empty stack!");
        }
        return data[ptr];
    }
}
