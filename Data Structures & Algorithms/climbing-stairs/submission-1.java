class Solution {
    public int climbStairs(int n) {
       int dp[] = new int[n + 1];
       Arrays.fill(dp, -1);
       return solve(n , dp);
    }
    public static int solve(int n, int[] dp){
        if (n < 0){
            return 0 ;
        }
        if (n == 0){
            return 1 ;
        }
        if (dp[n] != -1){
            return dp[n];
        }
        int prev1 = solve(n-1, dp);
        int prev2 = solve(n - 2, dp);
        return dp[n] = prev1 + prev2 ;
    }
}
