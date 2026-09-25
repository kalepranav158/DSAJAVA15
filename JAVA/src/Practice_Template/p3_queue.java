package Practice_Template;

public class p3_queue {
        static class Queue {
            int[] queue;
            int capacity;
            int front;
            int rear;

            // Constructor
            public Queue(int capacity) {
                this.capacity = capacity;
                queue = new int[capacity];
                front = 0;
                rear = -1;
            }

            // Check if queue is empty
            public boolean isEmpty() {
                return rear < front;
            }

            // Check if queue is full
            public boolean isFull() {
                return rear == capacity - 1;
            }

            // Enqueue operation
            public void enqueue(int val) {
                if (isFull()) {
                    System.out.println("Queue Overflow! Cannot insert " + val);
                    return;
                }
                queue[++rear] = val;
            }

            // Dequeue operation
            public int dequeue() {
                if (isEmpty()) {
                    System.out.println("Queue Underflow! Cannot remove");
                    return -1;
                }
                int val = queue[front++];
                System.out.println("Removed: " + val);
                return val;
            }

            // Peek operation
            public void peek() {
                if (isEmpty()) {
                    System.out.println("Queue is empty");
                    return;
                }
                System.out.println("Front element: " + queue[front]);
            }

            // Display queue
            public void display() {
                if (isEmpty()) {
                    System.out.println("Queue is empty");
                    return;
                }
                System.out.print("Queue elements: ");
                for (int i = front; i <= rear; i++) {
                    System.out.print(queue[i] + " ");
                }
                System.out.println();
            }
        }

        // Main method
        public static void main(String[] args) {
            Queue q = new Queue(5);

            q.enqueue(10);
            q.enqueue(20);
            q.enqueue(30);

            q.display();
            q.peek();
            q.dequeue();
            q.display();
        }
    }


