class Solution {
    public int minCostClimbingStairs(int[] cost) {
       int n = cost.length;
       int []dp = new int [n + 1] ;
       Arrays.fill(dp, -1);
       return solve (n, cost, dp);
    }
    // // This is memoization approach
    // public static int solve(int n, int[] cost, int[] dp){
    //     if (n == 0 || n == 1){
    //         return 0 ;
    //     }
    //     if (dp[n] != -1){
    //         return dp[n];
    //     }
    //     return dp[n] = Math.min(cost[n-1] + solve(n-1, cost, dp), cost[n-2] + solve(n-2, cost,dp));
        
    // }

    // Now going to solve by tabulation method or bottom to up approach
    public static int solve(int n, int[] cost, int[] dp){
        dp[0] = 0 ;
        dp[1] = 0 ;
        for (int i = 2 ; i <= n ; i++){
            dp[i] = Math.min ( cost[i-1]+ dp[i-1], cost[i-2]+dp[i-2]);
        }
        return dp[n];
        
    }

}
