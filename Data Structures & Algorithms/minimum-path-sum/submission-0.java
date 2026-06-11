class Solution {

    public static int solve(int i, int j, int[][] grid, int[][] dp){
       int m = grid.length ;
       int n = grid[0].length ;
        if (i == grid.length - 1 && j == grid[0].length -1){
            return grid[m - 1][n -1];
        }
        if ( i >= m || j >= n){
            return Integer.MAX_VALUE ;
        }
        if ( dp[i][j] != -1){
            return dp[i][j];
        }
        int right = solve(i, j+1, grid,dp);
        int down = solve( i + 1, j , grid,dp);

        return dp[i][j] = grid[i][j] + Math.min(right, down);
    }

    public  int minPathSum(int[][] grid) {

       int i = 0 , j = 0 ;
       int m = grid.length ;
       int n = grid[0].length ;
       int[][] dp = new int[m][n] ;
       for (int k = 0 ; k < m ; k++){
        Arrays.fill(dp[k], -1);
       }
       return solve(i, j, grid, dp); 
    }
}