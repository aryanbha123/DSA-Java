package LoveBabbar;

// max & min element in an array
public class Topic2 {
    public static int[] maxAndMin(int arr[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                System.out.println("..");
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return new int[] { max, min };
    }

    public static void main(String[] args) {
        int []arr = { 999, 122, 1, 2, 33, 33, 22, 1111, 23, -11, 23 };
        int maxAndMinElement[] = maxAndMin(arr);
        System.out.println(maxAndMinElement[0]);
        System.out.println(maxAndMinElement[1]);
    }
}
