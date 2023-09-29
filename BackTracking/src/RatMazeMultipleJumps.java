public class RatMazeMultipleJumps {
    public static void solve(int[][] maze, int N)
    {
        // add your code here
        // add your code here
        int [][]curPath = new int[N][N];

        // returns true only if there is some path exist
        if(findMinPath(maze, N, curPath, 0, 0)){
            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    System.out.print(curPath[i][j]+" ");
                }
                System.out.println();
            }
        }else{
            System.out.println("-1");
        }
    }
    private static boolean findMinPath(int[][] maze, int N, int[][] curPath, int i, int j){

        curPath[i][j] = 1;

        if(i == N-1 && j == N-1){
            return true;
        }

        if(maze[i][j] != 0){
            // starting from k=1 because problem says
            // "the shortest earliest hop will be accepted" therefore we will start from 1
            // and gradually increase it to maze[i][j]
            // doing j+k before i+k because problem says
            // "forward will be preferred over downward" <--------- STEP 1
            // using only 1 for loop becuase the top priority is TAKING SHORTEST HOP
            // so if possible to take shortest hop(jump of 1) in the right direction
            // we will take it, other wise before incrementing our jump length
            // (from 1 to 2) first we will check whether it's possible to take jump of 1
            // downwards if possible we will start moving downward and then again from
            // this cell we will follow STEP 1
            for(int k=1; k<=maze[i][j]; k++){
                if(isSafe(N, i, j+k)){
                    if(findMinPath(maze, N, curPath, i, j+k)){
                        return true;
                    }
                    // if false is returned that means this cur path will not lead to
                    // destination therfore we will backtrack (change to 0)
                    curPath[i][j+k] = 0;
                }
                if(isSafe(N, i+k, j)){
                    if(findMinPath(maze, N, curPath, i+k, j)){
                        return true;
                    }
                    curPath[i+k][j] = 0;
                }
            }
        }

        return false;
    }

    private static boolean isSafe(int N, int i, int j){
        return (i>=0 && i<N && j>=0 && j<N);
    }

    public static void main(String[] args) {
        int N = 4;
        int[][] maze = {{2,1,0,0},{3,0,0,1},
            {0,1,0,1},{0,0,0,1}};
        solve(maze,N);

    }
}
