
class Solution {
  /*  // Using Recursion
    public static int solve(int[] cost, int n){
      if (n == 0 || n == 1) 
        return 0;

      // Jump from onestep before
        int prev1 = solve(cost, n - 1) + cost[n - 1];
      // Jump from two step before
        int prev2 = solve(cost, n - 2) + cost[n-2];
        return Math.min(prev1, prev2);  
    }

    */

    // Using Memoization
    public static int solve(int[] cost, int n, int[] dp){
      if(n == 0 || n == 1)
        return 0;

      if (dp[n] != -1)
        return dp[n];

      return dp[n] = Math.min(solve(cost, n -1,dp) + cost[n-1], solve(cost, n - 2,dp) + cost[n-2]);  

    }
    public int minCostClimbingStairs(int[] cost) {
      // int prev2 = cost[0];
      //   int prev1 = cost[1];

      //   for(int i = 2; i < cost.length; i++) {

      //       int curr = cost[i]
      //           + Math.min(prev1, prev2);

      //       prev2 = prev1;
      //       prev1 = curr;
      //   }

      //   return Math.min(prev1, prev2);

        int n = cost.length ;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return solve(cost, n, dp);

    }
}
