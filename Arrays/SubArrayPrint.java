import java.util.HashMap;
import java.util.HashSet;

class SubArrayPrint {

    public static void printSubArr(int[] arr) {
        int N = arr.length;
        for (int windowSize = 1; windowSize <= N; windowSize++) {
            for (int start = 0; start <= N - windowSize; start++) {
                int end = start + windowSize;
                for (int i = start; i < end; i++)
                    System.out.print(arr[i] + " ");
                System.out.println();
            }
        }
    }

    // sliding window
    public static int maxSumSubArr(int[] arr, int k) {
        int maxSum = 0, N = arr.length;
        for (int i = 0; i < k; i++) {
            maxSum += arr[i];
        }
        int currentSum = maxSum;
        for (int j = k; j < N; j++) {
            currentSum = (currentSum + arr[j]) - arr[j - k];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        return maxSum;
    }
    // dynamic programming

    public static int longestIncreasingSubArr(int[] arr) {
        int maxLength = 0;
        int[] dp = new int[arr.length];
        dp[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            dp[i] = 1;
            if (arr[i] > arr[i - 1]) {
                dp[i] += dp[i - 1];
            }
        }
        for (int i = 0; i < arr.length; ++i) {
            if (maxLength < dp[i]) {
                maxLength = dp[i];
            }
        }
        return maxLength;

    }

    public static int longestIncreasingSubSequence(int[] arr) {
        int maxLength = 1, N = arr.length;
        int[] dp = new int[N];
        dp[0] = 1;

        for (int i = 1; i < N; ++i) {
            dp[i] = 1;
            for (int j = i - 1; j >= 0; --j) {
                if (arr[i] > arr[j]) {
                    int presentAnswer = dp[j] + 1;
                    if (presentAnswer > dp[i]) {
                        dp[i] = presentAnswer;
                    }
                }
            }
            if (dp[i] > maxLength) {
                maxLength = dp[i];
            }
        }

        for (int i = 0; i < N; ++i) {
            if (maxLength < dp[i]) {
                maxLength = dp[i];
            }
        }

        return maxLength;
    }

    public static long maxSumArrayDistinct(int[] arr, int k) {
        long maxSum = 0, currentSum = 0;
        HashMap<Integer, Integer> set = new HashMap<>();
        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
            if (set.containsKey(arr[i]) == true) {
                set.put(arr[i], set.get(arr[i]) + 1);
               continue;
            }
            set.put(arr[i], 1);
        }

        System.out.println();
        if (set.size() == k) {
            maxSum = currentSum;
        }

        for (int i = k; i < arr.length; i++) {

            if (set.get(arr[i - k]) == 1 ) {
                set.remove(arr[i - k]);
            } else {
                set.put(arr[i - k], set.get(arr[i - k]) - 1);
            }

            if (set.containsKey(arr[i]) == true) {
                set.put(arr[i], set.get(arr[i]) + 1);
            }else{
                set.put(arr[i], 1);
            }

            currentSum -= arr[i - k];
            currentSum += arr[i];
            System.out.println("CS " + currentSum);
            if (set.size() == k && currentSum > maxSum) {
                maxSum = currentSum;
            }
            System.out.println("MS " + maxSum);
        }

        return maxSum;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 4, 0, 14, 14, 9 };
        // printSubArr(arr);
        // System.out.println(maxSumSubArr(arr, 2));
        // System.out.println(longestIncreasingSubSequence(arr));
        // System.out.println(longestIncreasingSubArr(arr));
        System.out.println(maxSumArrayDistinct(arr, 4));

    }
}