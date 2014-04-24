package Chap9;
public class Hop {
    public static int hop(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i < n+1; i++) {
            dp[i] = dp[i-3]+dp[i-2]+dp[i-1];
        }
        return dp[n];
    }
}
