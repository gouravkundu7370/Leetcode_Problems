public class ExistsPath {
    //Function to find whether a path exists from the source to destination.
    static boolean res=false;
    public static boolean is_Possible(int[][] grid)
    {

        int b=0;
        int[][] vis =new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    dfs(i,j,grid,vis);
                    b=1;
                    break;
                }
                if(b==1)
                    break;
            }
        }
        return res;
    }

    static void dfs(int i, int j, int[][] grid, int[][] vis){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]==0 || vis[i][j]==1){
            return;
        }
        if(grid[i][j]==2){
            res=true;
        }
        grid[i][j]=2;
        vis[i][j]=1;
        dfs(i+1,j,grid,vis);
        dfs(i-1,j,grid,vis);
        dfs(i,j-1,grid,vis);
        dfs(i,j+1,grid,vis);
        vis[i][j]=0;
    }

    public static void main(String[] args) {
        int[][] grid = {{3,0,3,0,0},{3,0,0,0,3}
                ,{3,3,3,3,3},{0,2,3,0,0},{3,0,0,1,3}};
        System.out.println(is_Possible(grid));
    }
}
