class Solution {

    // Memoization show
    public static int solve(int m, int n, int[][] obstacleGrid,int[][] dp){

        if (m < 0 || n < 0){
            return 0 ;
        }

        // Obstacle comes
        if (obstacleGrid[m][n] == 1){
            return 0 ;
        }

        if ( m == 0 && n == 0 ){
            return 1 ;
        }
        
        if (dp[m][n] != -1 ){
            return dp[m][n];
        }

        int left = solve(m, n - 1 , obstacleGrid, dp);
        int top = solve (m - 1, n, obstacleGrid, dp);
        return dp[m][n] =  left + top ;

    }

    // Bottom Up

    // public static int solve (int m, int n, int[][] grid, int[][] dp){
       

    // }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length ;
        int n = obstacleGrid[0].length ;
        int [][]dp = new int[m][n] ;

        for (int i = 0 ; i < dp.length ; i++){
            Arrays.fill(dp[i], -1);
        }

        return solve(m - 1, n - 1, obstacleGrid, dp);
    }
}