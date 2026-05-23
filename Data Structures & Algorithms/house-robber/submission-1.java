class Solution {
 /* Using recursion but show TLE 
  Note : Then index comes from 0 or last ; 
 public static int solve(int[] nums, int n){
    if (n < 0){
      return 0 ;
    }
    //int pick from last index ;
    int picked = solve(nums, n - 2) + nums[n];
    // not picked last picked second last
    int notPicked = solve(nums, n - 1) ;
    return Math.max(picked, notPicked);
  }
  */

  /* 
  public static int solve (int[] nums, int i){
     if ( i > nums.length)
        return 0;

    // Picked 0th index and move +2 index
      int picked = nums[i] + solve(nums, i+2);

      // If not picked 0th idex pick 1th and move picked i+2 ;
      int notPicked = solve(nums,i+1);

     return Math.max(picked,notPicked);
  }

  */

  
  //  Using Memoization
      public int solve(int[] nums, int i, int[] dp){
        if (i >= nums.length)
          return 0;

         if (dp[i] != -1)
            return dp[i];

        int picked = nums[i] + solve(nums, i + 2, dp);
        int notPicked = solve(nums, i+1, dp);
        return dp[i] = Math.max(picked, notPicked);    
      }

   


    public int rob(int[] nums) {
        // int n = nums.length -1;

        int[] dp = new int[nums.length];
        for (int i = 0 ; i < dp.length ; i++){
           dp[i] = -1 ;
        }
        return solve(nums,0,dp);
    }
}
