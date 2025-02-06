import java.util.Scanner;

public class SlidingWindow {

    // Method to print all subarrays of the given array
    public static void printSubArr(int[] arr) {
        int N = arr.length;
        
        // Loop through all possible window sizes from 1 to N
        for (int windowSize = 1; windowSize <= N; ++windowSize) {
            // Loop through each starting index for the current window size
            for (int start = 0; start <= N - windowSize; ++start) {
                int end = start + windowSize; // Calculate the ending index of the window
                
                // Print the subarray of the current window size
                System.out.print("[");
                for (int i = start; i < end; ++i) {
                    System.out.print(arr[i]);
                    if (i < end - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.print("] ");
            }
            System.out.println(); // Print a newline after each window size
        }
    }
    
    // Method to display the array
    public static void displayArr(int[] arr){
        for(int i = 0 ; i < arr.length ; ++i){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int N = input.nextInt(); // Number of elements in the array
        int[] arr = new int[N]; // Create an array of size N

        System.out.println("Enter the elements of the array:");
        for(int i = 0 ; i < N ; ++i){
            arr[i] = input.nextInt(); // Input each element
        }
        
        System.out.println("The array is:");
        displayArr(arr); // Display the input array
        
        System.out.println("All possible subarrays are:");
        printSubArr(arr); // Print all subarrays using sliding window approach

        input.close(); // Close the Scanner
    }
}
