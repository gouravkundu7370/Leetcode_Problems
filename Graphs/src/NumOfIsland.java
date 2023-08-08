public class NumOfIsland {
    public static void dfs(int row, int col, char[][] grid, int[][] vis, int[] dRow, int[] dCol) {

        int n = grid.length;
        int m = grid[0].length;
        vis[row][col] = 1;

        for(int i=0; i<8; i++) {
            int nrow = row + dRow[i];
            int ncol = col + dCol[i];

            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m
                    && vis[nrow][ncol] == 0 && grid[nrow][ncol]=='1') {
                dfs(nrow, ncol, grid, vis, dRow, dCol);
            }
        }
    }
    // Function to find the number of islands.
    public static int numIslands(char[][] grid) {
        // Code here

        int n = grid.length;
        int m = grid[0].length;
        int[][] vis = new int[n][m];
        int islandCount=0;

        int[] dRow = {-1,-1,-1,0,0,1,1,1};
        int[] dCol = {-1,0,1,-1,1,-1,0,1};
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(vis[i][j]==0 && grid[i][j]=='1') {
                    islandCount++;
                    dfs(i, j, grid, vis, dRow, dCol);
                }
            }
        }
        return islandCount;

    }

    public static void main(String[] args) {
        char[][] grid = {{0,1,1,1,0,0,0},{0,0,1,1,0,1,0}};
        System.out.println(numIslands(grid));
    }
}
