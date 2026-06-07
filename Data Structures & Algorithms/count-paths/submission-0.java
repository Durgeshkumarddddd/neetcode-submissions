class Solution {


    public int uniquePaths(int m, int n) {
        int[][] grid = new int[m][n];

        // Since there is only one way to reach in column 0 only bottom-bottom
        for (int i = 0 ; i < m ; i++){
            grid[i][0] = 1 ;
        }
        // Since there is only one way to reach in row 0 at any index
        for (int i = 0 ; i < n ; i++){
            grid[0][i] = 1 ;
        }

        /*
        Top  = 1
        Left = 1
        1+1 = 2

        1 1 1
        1 2 ?
        1 ? ?

        */

        for (int i = 1 ; i < m ; i++){
            for (int j = 1 ; j < n ; j++){
                // from right side ways
                int right = grid[i][j - 1];
                // from bottom side ways means from left side ways
                int bottom = grid[i - 1][j];

                grid[i][j] = right + bottom ;
            }
        }

        return grid[m-1][n-1];
    }
}
