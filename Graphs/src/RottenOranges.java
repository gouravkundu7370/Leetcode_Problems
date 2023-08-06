import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {
      //Function to find minimum time required to rot all oranges.
     static class Pair{
        int r,c,t;
        Pair(int r,int c,int t){
            this.r = r;
            this.c = c;
            this.t = t;
        }
    }
    //Function to find minimum time required to rot all oranges.
    public static int orangesRotting(int[][] grid)
    {
        // Code here
        int r = grid.length;
        int c = grid[0].length;
        int fc = 0, tm=0;
        Queue<Pair> q = new LinkedList<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i,j,0));
                }
                else if(grid[i][j]==1)
                    fc++;
            }
        }
        int rc = 0;
        while(!q.isEmpty()){
            Pair curr = q.poll();
            int curri = curr.r;
            int currj = curr.c;
            int currt = curr.t;
            tm = Math.max(tm,currt);
            if(currj-1>=0 && grid[curri][currj-1]==1){
                q.add(new Pair(curri,currj-1,currt+1));
                rc++;
                grid[curri][currj-1] = 2;
            }
            if(currj+1<c && grid[curri][currj+1]==1){
                q.add(new Pair(curri,currj+1,currt+1));
                rc++;
                grid[curri][currj+1] = 2;
            }
            if(curri-1>=0 && grid[curri-1][currj]==1){
                q.add(new Pair(curri-1,currj,currt+1));
                rc++;
                grid[curri-1][currj] = 2;
            }
            if(curri+1<r && grid[curri+1][currj]==1){
                q.add(new Pair(curri+1,currj,currt+1));
                rc++;
                grid[curri+1][currj] = 2;
            }
        }
        if(fc != rc ) return -1;
        return tm;
    }

    public static void main(String[] args) {
        int[][] grid = {{0,1,2},{0,1,2},{2,1,1}};
        System.out.println(orangesRotting(grid));

    }
}
