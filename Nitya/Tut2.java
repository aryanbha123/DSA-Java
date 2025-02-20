
import java.util.Scanner;

public class Tut2 {
    // Pallindrome Number
    public static boolean checkPallindrome(int[] arr, int n) {
        boolean ans = true;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            if (arr[left] != arr[right]) {
                ans = false;
            }
            left++;
            right--;
        }
        return ans;
    }

    public static void main(String[] args) {
        // int arr1[] = {1,2,3,2,1}; // yes
        // int arr2[] = {1,2,3,4,1}; // no
        // int n1 = arr1.length;
        // int n2 = arr2.length;

        // boolean ans1 = checkPallindrome(arr1, n1);
        // boolean ans2 = checkPallindrome(arr2, n2);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        boolean ans = checkPallindrome(arr, n);
        if (ans == true) {
            System.out.println("Yes Pallindrome");
        } else {
            System.out.println("No Pallindrome");

        }

    }
}
