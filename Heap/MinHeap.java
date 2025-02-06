public class MinHeap {
    int[] heap;
    int size, length;

    MinHeap(int n) {
        this.heap = new int[n];
        this.size = n;
        this.length = 0;
    }

    int getParent(int index) {
        return (index - 1) / 2;
    }

    int getLeftChild(int index) {
        return (2 * index) + 1;
    }

    int getRightChild(int index) {
        return (2 * index) + 2;
    }

    void swap(int parent, int child) {
        int temp = heap[parent];
        heap[parent] = heap[child];
        heap[child] = temp;
    }

    void heapify(int position) {
        if (isLeaf(position)){

            return;
        }
        int left = getLeftChild(position);
        int right = getRightChild(position);
        int smallest = position;

        if(left < length && heap[left] < heap[position]){
            smallest = left;
        }

        if(right < length && heap[right] < heap[position]){
            smallest = right;
        }

        if(smallest != position){
            smallest = (heap[left] < heap[right] ? left : right);
            swap(position, smallest);
            heapify(smallest);
        }
       
    }

    boolean isLeaf(int index) {
        return (index > (length / 2) && index < length) ? true : false;
    }

    int extractMax() {
        int top = heap[0];
        heap[0] = heap[--length];
        heapify(0);
        return top;
    }

    void insert(int value) {
        if (size == length) {
            return;
        }

        int position = length;
        heap[position] = value;
        length++;
        while (heap[position] < heap[getParent(position)]) {
            swap(position, getParent(position));
            position = getParent(position);
        }
    }

    void display() {
        for (int i = 0; i < length / 2; i++) {

            System.out.print("Parent : " + heap[i]);

            if (getLeftChild(i) < length) {
                System.out.print(" Left Child : " + heap[getLeftChild(i)]);
            }
            if (getRightChild(i) < length) {
                System.out.print(" Right Child : " + heap[getRightChild(i)]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MinHeap head = new MinHeap(10);
        head.insert(1);
        head.insert(2);
        head.insert(3);
        head.insert(4);
        head.insert(5);
        head.insert(6);
        head.insert(7);
        head.display();
        System.out.println();
        head.extractMax();
        head.display();

    }
}
