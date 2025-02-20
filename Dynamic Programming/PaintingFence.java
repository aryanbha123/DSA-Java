import java.util.Arrays;

public class PaintingFence {
    // colour (k) = 2
    public static int count(int n,int[]dp) {
        if(n == 1) return 2;
        if(n == 2) return 4;
        if(dp[n] != -1) return dp[n];
        dp[n] = (count(n-1, dp)*2) + (count(n-1, dp));
        return dp[n];
    }

    public static int countWays(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return count(n,dp);
    }

    public static void main(String[] args) {
        System.out.println(countWays(5));
        System.out.println(countWays(3)); // 
        System.out.println(countWays(2)); // 4
    }
}
