class Solution {
    public int minCostClimbingStairs(int[] cost) {
       int n = cost.length;
       int []dp = new int [n + 1] ;
       Arrays.fill(dp, -1);
       return solve (n, cost, dp);
    }
    public static int solve(int n, int[] cost, int[] dp){
        if (n == 0 || n == 1){
            return 0 ;
        }
        if (dp[n] != -1){
            return dp[n];
        }
        return dp[n] = Math.min(cost[n-1] + solve(n-1, cost, dp), cost[n-2] + solve(n-2, cost,dp));
        
    }

}
