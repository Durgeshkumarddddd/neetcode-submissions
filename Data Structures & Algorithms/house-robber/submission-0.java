class Solution {
    public int rob(int[] nums) {
        int i = 0;
        int[] dp = new int[nums.length+1];
        Arrays.fill(dp, -1);
        return solve ( i, nums,dp);
    }
    public static int solve( int i, int []nums,int []dp){
        if ( i >= nums.length){
            return 0 ;
        }
        if (dp[i] != -1){
            return dp[i];
        }
           
        int rob =  nums[i] + solve( i+2, nums,dp);
        int skip = solve(i+1, nums,dp);
        
       return dp[i] = Math.max(rob,skip);
    }
        
    }

