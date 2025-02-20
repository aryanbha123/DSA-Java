public class Tut4 {
    // Loops :
    // 1. For loop
    // 2. While Loop
    // 3. Do-While
    // 4. For-Each Loop
    // 5. Controll Statements : IF ELSE, break,continue
    // P1: largest element in an array
    // P2: 2nd largest element in an array
    // Q1. Target Sum (Set)
    // Q2. Two Sum (Map)


    public  static int findLargest(int []arr, int n){

        int max = Integer.MIN_VALUE; // is se chota kuch ni milega
        for(int i = 0 ; i < n ; i++){
            int curr = arr[i];
            if(curr >  max){
                max = curr;
            }
        }
        return max;

    }

    public static int Secondlargest(int []arr, int n){
        int largest = Integer.MIN_VALUE;
        for(int i =0 ; i < n ; i++){
            int curr = arr[i];
            if(curr > largest){
                largest = curr;
            }
        }
        // O(nlogn) > O(N) + O(N)
        int secondLar = Integer.MIN_VALUE;
        for(int i =0 ; i< n ; i++){
            if(arr[i] == largest){
                continue;
            }
            if(arr[i] > secondLar){
                secondLar = arr[i];
            }
        }
        return secondLar;
    }
    public static void main(String[] args) {
        // int[] arr = { 1, 2, 3, 4 };
        // for(int i =0 ; i  < arr.length ; i++){
        //     if(i == 2){
        //         continue;
        //     }

        //     // code : exicute
        //     System.out.println(i);
        // }

        // output : 98 , 78
        int []arr = {-1,3,4,3,2,66,78,98,11};
        System.out.println(findLargest(arr,arr.length));
        System.out.println(Secondlargest(arr,arr.length));

    }
}