public class XTotalShape {
    public static void main(String[] args) {

        char[][] grid ={{'X','O','X'},{'O','X','O'},{'X','X','X'}};
        System.out.println(xShape(grid));

    }

    static int[] xDir = {0,0,1,-1};
    static int[] yDir = {1,-1,0,0};
    public static boolean isSafe(char[][] grid,int i,int j)
    {
        return(i >=0 && i<grid.length && j>=0 && j<grid[0].length && grid[i][j] == 'X');
    }
    public static void DFS(char[][] grid,int i , int j)
    {
        if(isSafe(grid,i,j))
        {
            grid[i][j] = 'O';
            for(int x = 0;x<4;x++)
            {
                int newRow = i+xDir[x];
                int newCol = j+yDir[x];
                DFS(grid,newRow,newCol);
            }
        }
    }
    public static int xShape(char[][] grid)
    {
        int count = 0;
        for(int i = 0;i<grid.length;i++)
        {
            for(int j = 0;j<grid[0].length;j++)
            {
                if(grid[i][j] == 'X')
                {
                    count++;
                    DFS(grid,i,j);
                }
            }
        }
        return count;
    }
}
