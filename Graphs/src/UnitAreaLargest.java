public class UnitAreaLargest {
    public static void main(String[] args) {

        int[][] grid = {{1,1,1,0},{0,0,1,0},{0,0,0,1}};
        System.out.println(findMaxArea(grid));

    }
    static class result{
        int count;
        int res;
        result(){
            this.count = 0;
            this.res = 0;
        }
        result(int count, int res){
            this.count = count;
            this.res = res;
        }
    }
    public static int findMaxArea(int[][] grid)
    {
        // Code here
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        result r = new result();
        r.count = 0;
        r.res = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(!visited[i][j] && grid[i][j]==1){
                    r.count = 0;
                    islandSearch(grid, visited, r, i, j, n, m);
                }
            }
        }
        return r.res;
    }
    public static void islandSearch(int[][] grid, boolean[][] visited,
                                    result r, int i, int j, int n, int m){
        visited[i][j] = true;
        r.count++;
        r.res = Math.max(r.res,r.count);
        if(i-1>=0  && j+1<m && grid[i-1][j+1]==1 && !visited[i - 1][j + 1]){
            islandSearch(grid, visited, r, i-1, j+1, n, m);
        }
        if(j+1<m && grid[i][j+1]==1 && !visited[i][j + 1]){
            islandSearch(grid, visited, r, i, j+1, n, m);
        }
        if(i+1<n && j+1<m && grid[i+1][j+1]==1 && !visited[i + 1][j + 1]){
            islandSearch(grid, visited, r, i+1, j+1, n, m);
        }
        if(i-1>=0 && grid[i-1][j]==1 && !visited[i - 1][j]){
            islandSearch(grid, visited, r, i-1, j, n, m);
        }
        if(i+1<n && grid[i+1][j]==1 && !visited[i + 1][j]){
            islandSearch(grid, visited, r, i+1, j, n, m);
        }
        if(i-1>=0 && j-1>=0 && grid[i-1][j-1]==1 && !visited[i - 1][j - 1]){
            islandSearch(grid, visited, r, i-1, j-1, n, m);
        }
        if(j-1>=0 && grid[i][j-1]==1 && !visited[i][j - 1]){
            islandSearch(grid, visited, r, i, j-1, n, m);
        }
        if(i+1<n && j-1>=0 && grid[i+1][j-1]==1 && !visited[i + 1][j - 1]){
            islandSearch(grid, visited, r, i+1, j-1, n, m);
        }
    }
}
