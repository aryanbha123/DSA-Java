package Leetcode;
import java.util.PriorityQueue;

public class ltd216 {

    // kth largest element
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for(int i : nums){
            heap.add(i);
            if(heap.size() > k){
                heap.poll();
            }
        }
        return heap.peek();
    }

    public static void main(String[] args) {
        int[] arr = {1,33,15,3,5,7};
        int kthlargest = findKthLargest(arr,3);
        System.out.println(kthlargest);
    }
}
 
