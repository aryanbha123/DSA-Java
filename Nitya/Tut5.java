// import java.util.HashMap;
// import java.util.HashSet;

// public class Tut5 {

//     //  TWO SUM

//     // 0 1 2 12 3 4 
//     // 0 1 2 3 4 5
//     // targer = 14 // ouput : [2,3]

//     /*
//      * 
//      * 0 , 0 + 1, 0 + 2, 0 + 3 , sum == target ? 
//      */


//      // O(n^2) Quadratic
//     // public static int[] twoSum(int[] nums, int target) {
//     //     for(int i = 0 ; i < nums.length ; i++){
//     //         for(int j = 0 ; j < nums.length ; j++){
//     //             if( i == j){
//     //                 continue;
//     //             }
//     //             int sum = nums[i] + nums[j];
//     //             if(sum == target){
//     //                 return new int[]{i+1,j+1};
//     //             }
//     //         }
//     //     }
//     //     return new int[]{-1,-1};
//     // }

//     //  a = {1,23,4}
//     // public static int[] twoSum(int[] nums, int target) {
    
//         // HashMap<Integer,Integer> map = new HashMap<>();

//         /*{
//             1:0,
//             2:1,

//         }*/ 
//         // 1,2,12,3,4,6  , 14 - 12 =  2 , {1 }
//         // target : 14 ,  
//         // for(int i = 0 ; i < nums.length ; i++){
//         //     int complement = target - nums[i];
//         //     // set.add(nums[i]);
//         // }

//     }
//     public static void main(String[] args) {
        
//         int []arr = {1,2,12,3,4,6};
//         int []ans = twoSum(arr,14);

//         for(int i = 0 ; i<  ans.length ; i++){
//             System.out.println(ans[i]);
//         }
//     }
// }
