import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class MinimumCostSrcToDes {
    public static int minimumCostPath(int[][] grid)
    {
        Queue<int[]> queue = new PriorityQueue<>((a, b)->a[0]-b[0]);
        int [][] costs = new int[grid.length][grid[0].length];
        for(int i = 0; i<costs.length; i++){
            Arrays.fill(costs[i], Integer.MAX_VALUE);
        }
        queue.add(new int[]{grid[0][0], 0, 0});

        int[][] ds = {{0,1},{0, -1},{1,0},{-1,0}};

        while(!queue.isEmpty()){
            int[] temp = queue.poll();
            int cost = temp[0];
            int x = temp[1];
            int y = temp[2];


            if(x==grid.length-1 && y == grid[0].length-1){
                return cost;
            }


            for(int k = 0; k<ds.length; k++){
                int newX = x+ ds[k][0];
                int newY = y+ ds[k][1];

                if(isSafe(newX, newY, grid.length, grid[0].length) && costs[newX][newY]>cost + grid[newX][newY] ){
                    int newCost = cost + grid[newX][newY];
                    queue.add(new int[]{newCost, newX, newY});
                    costs[newX][newY] = newCost;
                }
            }


        }
        return -1;
    }

    public static boolean isSafe(int row, int col, int N, int M){
        return row >= 0 && col >= 0 && row < N && col < M;
    }

    public static void main(String[] args) {
        int[][] grid = {{9,4,9,9},{6,7,6,4},
                {8,3,3,7},{7,4,9,10}};
        System.out.println(minimumCostPath(grid));
    }
}
