package Practice_Template;

public class linked_list_all_Operations {
    public class SinglyLinkedList {
        /* ---------- Node Definition ---------- */
        private static class Node {
            int data;
            Node next;
            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        /* ---------- List State ---------- */
        private Node head;
        private Node tail;
        private int size;


        /* ---------- Constructor ---------- */
        public SinglyLinkedList() {
            head = tail = null;
            size = 0;
        }

        /* ---------- Insertion Operations ---------- */

        // O(1)
        public void addFirst(int data) {
            Node node = new Node(data);
            node.next = head;
            head = node;

            if (tail == null) tail = head;
            size++;
        }

        // O(1)
        public void addLast(int data) {
            Node node = new Node(data);

            if (tail == null) {
                head = tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
            size++;
        }

        // O(n)
        public void addAt(int index, int data) {
            if (index < 0 || index > size)
                throw new IndexOutOfBoundsException("Invalid index");

            if (index == 0) {
                addFirst(data);
                return;
            }
            if (index == size) {
                addLast(data);
                return;
            }

            Node prev = getNode(index - 1);
            Node node = new Node(data);

            node.next = prev.next;
            prev.next = node;
            size++;
        }

        /* ---------- Deletion Operations ---------- */

        // O(1)
        public int removeFirst() {
            if (isEmpty())
                throw new IllegalStateException("List is empty");

            int value = head.data;
            head = head.next;

            if (head == null) tail = null;
            size--;

            return value;
        }

        // O(n)
        public int removeLast() {
            if (isEmpty())
                throw new IllegalStateException("List is empty");

            if (size == 1) return removeFirst();

            Node prev = getNode(size - 2);
            int value = tail.data;

            prev.next = null;
            tail = prev;
            size--;

            return value;
        }

        // O(n)
        public int removeAt(int index) {
            if (index < 0 || index >= size)
                throw new IndexOutOfBoundsException("Invalid index");

            if (index == 0) return removeFirst();
            if (index == size - 1) return removeLast();

            Node prev = getNode(index - 1);
            int value = prev.next.data;

            prev.next = prev.next.next;
            size--;

            return value;
        }

        /* ---------- Search Operations ---------- */

        // O(n)
        public boolean contains(int key) {
            return indexOf(key) != -1;
        }

        // O(n)
        public int indexOf(int key) {
            int index = 0;
            for (Node curr = head; curr != null; curr = curr.next) {
                if (curr.data == key) return index;
                index++;
            }
            return -1;
        }

        /* ---------- Utility Operations ---------- */

        // O(1)
        public int size() {
            return size;
        }

        // O(1)
        public boolean isEmpty() {
            return size == 0;
        }

        // O(n)
        public void reverse() {
            Node prev = null;
            Node curr = head;
            tail = head;

            while (curr != null) {
                Node next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            head = prev;
        }

        // O(n)
        public void display() {
            Node curr = head;
            while (curr != null) {
                System.out.print(curr.data + " -> ");
                curr = curr.next;
            }
            System.out.println("null");
        }

        /* ---------- Internal Helper ---------- */
        private Node getNode(int index) {
            Node curr = head;
            for (int i = 0; i < index; i++) {
                curr = curr.next;
            }
            return curr;
        }
    }

}
