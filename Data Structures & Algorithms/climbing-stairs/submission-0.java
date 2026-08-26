class Solution {
    public int climbStairs(int n) {
        if (n < 0){
            return 0 ;
        }
        if (n == 0){
            return 1 ;
        }
        int prev1 = climbStairs(n-1);
        int prev2 = climbStairs(n - 2);
        return prev1 + prev2 ;
    }
}
