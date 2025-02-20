
// 1. Reverse an Array
// 2. Pallindrone Check
// 3. Count the frequency of each character in a string and store in hashMap
// 4. Find the largest element in an array 
// 5. Find the second largest in an array
// 6. Two Sum

public class Tut1 {

    // Q1. Rverese An Array 
    public static void reverseArray(int arr[] , int n){
        // 2 pointer approch 
        int left = 0;
        int right = n - 1;
        // 0 1 2 3 4 5
        while (left <  right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;right--;
        }
    }

    public static void main(String[] args) {
        // // java is not a purely objects oriented programming language 
        // int a = 10; // we can use primitive data type

        // Step 1 : Array bnai : we created an array 
        int nitya[] = {1,2,3,4,5,6,7,8,9,10,11,12};
        // Step 2 : we initialised a variable with arrays length ;
        int n = nitya.length;
        for(int i = 0 ; i < n ; i++){
            System.out.print(nitya[i] + " ");
        }
        // Step 3 : we called function to reverse array
        reverseArray(nitya, n);
        System.out.println();
        for(int i = 0 ; i < n ; i++){ // O(n)  n=length
            System.out.print(nitya[i] + " ");
        }

    }
}



