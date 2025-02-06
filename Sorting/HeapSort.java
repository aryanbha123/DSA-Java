package Sorting;

import java.util.Scanner;

public class HeapSort {

    // Function to sort an array using in-place heapsort
    public static void heapsort(int[] arr) {
        int n = arr.length;

        // Step 1: Build Max-Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Step 2: Extract elements from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root (largest) to the end
            swap(arr, 0, i);

            // Reheapify the reduced heap
            heapify(arr, i, 0);
        }
    }

    // Function to heapify a subtree rooted at index 'i'
    private static void heapify(int[] arr, int n, int i) {
        int largest = i;        // Initialize largest as root
        int left = 2 * i + 1;   // Left child
        int right = 2 * i + 2;  // Right child

        // Check if left child is larger than root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // Check if right child is larger than the largest so far
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // If largest is not root, swap and recursively heapify
        if (largest != i) {
            swap(arr, i, largest);

            // Recursively heapify the affected subtree
            heapify(arr, n, largest);
        }
    }

    // Utility function to swap two elements in the array
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        // Input array elements
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Print original array
        System.out.println("Original Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Sort the array using heapsort
        heapsort(arr);

        // Print sorted array
        System.out.println("\nSorted Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
