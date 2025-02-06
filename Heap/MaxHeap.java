import java.util.PriorityQueue;

public class MaxHeap {
    int[] heap;
    int max_size, size;

    MaxHeap(int max_size) {
        this.max_size = max_size;
        heap = new int[max_size];
        size = 0;
    }

    int parent(int index) {
        return (index - 1) / 2;
    }

    int left(int index) {
        return (2 * index) + 1;
    }

    int right(int index) {
        return (2 * index) + 2;
    }

    void swap(int child, int parent) {
        int temp = heap[child];
        heap[child] = heap[parent];
        heap[parent] = temp;
    }

    void insert(int data) {
        if (size == max_size) {
            System.out.println("Heap is full");
            return;
        }
        int position = size;
        heap[position] = data;
        // check parent is larger or not
        while (heap[position] > heap[parent(position)]) {
            swap(position, parent(position));
            position = parent(position);
        }
        size++;
    }

    void display() {

        for(int i = 0 ; i < size/2 ; i++){
            System.out.print("Parent - " + heap[i] + " | ");
            if(left(i) < size){
                System.out.print("Left Child - " + heap[left(i)] + " | ");
            }
            if(right(i) < size){
                System.out.print("Left Child - " + heap[right(i)]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MaxHeap heap = new MaxHeap(10); // heap[10]
        heap.insert(10);
        heap.insert(20);
        heap.insert(30);    
        heap.insert(50);    
        heap.insert(40);    
        heap.insert(70);    
        heap.display();


        PriorityQueue<Integer> pq = new PriorityQueue<>(10);
        pq.add(10);
        pq.add(40);
        pq.add(30);
        pq.add(20);


        pq.peek();
    }
}
