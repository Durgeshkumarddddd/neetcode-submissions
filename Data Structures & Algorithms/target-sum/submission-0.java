class Solution {

    Integer[][] dp;

    public int findTargetSumWays(
        int[] nums,
        int target
    ) {

        dp =
            new Integer[
                nums.length
            ][2001];

        return solve(
            0,
            0,
            nums,
            target
        );
    }

    int solve(
        int i,
        int sum,
        int[] nums,
        int target
    ) {

        if(i == nums.length) {
            return sum == target ? 1 : 0;
        }

        if(dp[i][sum + 1000] != null) {
            return dp[i][sum + 1000];
        }

        int plus =
            solve(
                i + 1,
                sum + nums[i],
                nums,
                target
            );

        int minus =
            solve(
                i + 1,
                sum - nums[i],
                nums,
                target
            );

        return dp[i][sum + 1000]
            = plus + minus;
    }
}