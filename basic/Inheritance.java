import java.util.HashMap;

class Solution {
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> sumFrequency = new HashMap<>();
        int current_sum = 0;
        int subArrayCount = 0;

        // Initialize the map with 0 sum having frequency 1
        sumFrequency.put(0, 1);
        
        for (int i = 0; i < nums.length; i++) {
            current_sum += nums[i];
            
            // Check if (current_sum - k) is present in the map
            if (sumFrequency.containsKey(current_sum - k)) {
                subArrayCount += sumFrequency.get(current_sum - k);
            }
            
            // Update the frequency of current_sum in the map
            sumFrequency.put(current_sum, sumFrequency.getOrDefault(current_sum, 0) + 1);
        }
        
        return subArrayCount;
    }
}

/**
 * Inheritance
 */
public class Inheritance {

    public static void main(String[] args) {
        int[] a= {0,1,1,4,3,1,6};
        System.out.println(Solution.subarraySum(a,4));
    }
}
