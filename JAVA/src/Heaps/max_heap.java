package Heaps;

public class max_heap {

    int[] heap;
    int capacity;
    int size;

    public max_heap(int capacity) {
        this.capacity = capacity;
        heap = new int[capacity];
        size = 0;
    }

    // -------------------- INSERT --------------------

    public void insert(int element) {

        if (size == capacity) {
            System.out.println("Heap Overflow");
            return;
        }

        heap[size] = element;
        int index = size;
        size++;

        while (index > 0) {

            int parent = (index - 1) / 2;

            if (heap[parent] < heap[index]) {
                swap(parent, index);
                index = parent;
            } else {
                break;
            }
        }
    }

    // -------------------- DELETE --------------------

    public int delete() {

        if (size == 0) {
            System.out.println("Heap Empty");
            return -1;
        }

        int deleted = heap[0];

        heap[0] = heap[size - 1];
        size--;

        heapify(0, size);

        return deleted;
    }

    // -------------------- HEAPIFY --------------------

    public void heapify(int index, int heapSize) {

        while (true) {

            int largest = index;

            int left = 2 * index + 1;
            int right = 2 * index + 2;

            if (left < heapSize && heap[left] > heap[largest])
                largest = left;

            if (right < heapSize && heap[right] > heap[largest])
                largest = right;

            if (largest == index)
                break;

            swap(index, largest);

            index = largest;
        }
    }

    // -------------------- SWAP --------------------

    public void swap(int i, int j) {

        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    // -------------------- BUILD HEAP --------------------

    public void buildHeap() {

        for (int i = size / 2 - 1; i >= 0; i--) {
            heapify(i, size);
        }
    }

    // -------------------- HEAP SORT --------------------

    public void heapSort() {

        buildHeap();

        int heapSize = size;

        while (heapSize > 1) {

            swap(0, heapSize - 1);

            heapSize--;

            heapify(0, heapSize);
        }
    }

    // -------------------- PRINT --------------------

    public void print() {

        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }

        System.out.println();
    }

    public void printSorted() {

        for (int i = 0; i < heap.length; i++) {
            System.out.print(heap[i] + " ");
        }

        System.out.println();
    }

    // -------------------- MAIN --------------------

    public static void main(String[] args) {

        max_heap h= new max_heap(6);

        h.insert(40);
        h.insert(30);
        h.insert(60);
        h.insert(10);
        h.insert(80);
        h.insert(70);

        System.out.println("Heap:");
        h.print();

        System.out.println("Deleted = " + h.delete());

        System.out.println("After Deletion:");
        h.print();

        h.heapSort();

        System.out.println("Heap Sort:");
        h.printSorted();
    }
}