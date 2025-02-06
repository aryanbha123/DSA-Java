import java.util.PriorityQueue;

public class Heap {

    int[] heap;
    int size, MaxSize;

    Heap(int maxSize) {
        this.MaxSize = maxSize;
        this.size  = 0;
        heap = new int[maxSize];
    }

    int parent(int position) {
        return (position - 1) / 2;
    }

    int leftChild(int position) {
        return (position * 2) + 1;
    }

    int rightChild(int position) {
        return (position * 2) + 2;
    }

    void swap(int parent, int child) {
        int temp = heap[parent];
        heap[parent] = heap[child];
        heap[child] = temp;
    }



    int extractMax() {
        int del = heap[0];
        heap[0] = heap[--size];

        heapify(0);

        return 1;
    }

    void insert(int data) {

        int position = size;
        heap[position] = data;

        while (heap[position] > heap[parent(position)]) {
            swap(position, parent(position));
            position = parent(position);
        }
        size++;
    }

    boolean isLeaf(int position) {
        return (position > size / 2 && position < size) ? true : false;
    }

    void heapify(int position) {
        if (isLeaf(position)) {
            return; // No need to heapify leaf nodes
        }

        int left = leftChild(position);
        int right = rightChild(position);
        int largest = position;

        // Compare with the left child if it exists
        if (left < size && heap[left] > heap[largest]) {
            largest = left;
        }

        // Compare with the right child if it exists
        if (right < size && heap[right] > heap[largest]) {
            largest = right;
        }

        if (largest != position) {
            swap(position, largest);
            heapify(largest);
        }
    }

    void printHeap() {
        // print heap Array
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");

        }
        System.out.println();
    }

    void display() {
        for (int i = 0; i < size / 2; i++) {
            // Print the parent node
            System.out.print("Parent: " + heap[i] + " | ");

            // Print the left child if it exists
            if (leftChild(i) < size) {
                System.out.print("Left Child: " + heap[leftChild(i)]);
            } else {
                System.out.print("Left Child: None");
            }

            // Print the right child if it exists
            if (rightChild(i) < size) {
                System.out.println(" | Right Child: " + heap[rightChild(i)]);
            } else {
                System.out.println(" | Right Child: None");
            }
        }
    }

    public static void main(String[] args) {
        Heap heap = new Heap(100);

        // heap.insert(0);
        // heap.insert(2);
        // heap.insert(3);
        // heap.insert(6);
        // heap.insert(8);
        // heap.insert(81);
        // heap.printHeap();
        // heap.display();

        // PriorityQueue<Integer> heap = new PriorityQueue<>();

        // heap.add(1);
        // heap.add(3);
        // heap.add(31);
        // heap.add(21);
        // heap.add(11);

        // while (!heap.isEmpty()) {
        // System.out.print(heap.poll() + " ");
        // }

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(3);
        pq.add(0);
        // while (!pq.isEmpty()) {
        //     System.out.print(pq.poll() + " ");
        // }
        System.out.println(pq);
    }
}