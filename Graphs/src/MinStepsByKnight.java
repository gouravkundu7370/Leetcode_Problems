import java.util.ArrayDeque;
import java.util.Queue;

public class MinStepsByKnight {

     static class Pair{
        int x,y,s;
        Pair(int a,int b,int c){
            x = a;
            y = b;
            s=c;
        }
    }
    //Function to find out minimum steps Knight needs to reach target position.
    public static int minStepToReachTarget(int[] KnightPos, int[] TargetPos, int N)
    {
        //for minimum steps to reach target we use bfs traversal

        //to track the record of visited path we use visited array
        boolean [][] visited = new boolean[N+1][N+1];
        //to implement bfs, we declare a queue
        Queue<Pair> q = new ArrayDeque<>();
        //initially knight was
        int inX = KnightPos[0];
        int inY = KnightPos[1];
        int steps = 0;
        q.add(new Pair(inX,inY,steps));
        //knight can move 8 different position
        int [] distX = {-1,1,-1,1,2,-2,2,-2};
        int [] distY = {2,2,-2,-2,1,1,-1,-1};
        while(!q.isEmpty()){
            //remove
            Pair p = q.remove();
            //get data
            int xPos = p.x;
            int yPos = p.y;
            int step = p.s;
            //mark
            visited[xPos][yPos]=true;
            //work (if we reach at target position)
            if(xPos ==TargetPos[0] && yPos == TargetPos[1]){
                return step;
            }
            //add nbrs
            for(int i =0;i<8;i++){
                int newPosX = xPos+distX[i];
                int newPosY = yPos+distY[i];
                //check this positon is valid or not
                if(newPosX>0 && newPosY>0 && newPosX<=N && newPosY<=N && !visited[newPosX][newPosY]){
                    q.add(new Pair(newPosX,newPosY,step+1));
                    visited[newPosX][newPosY]=true;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int N=6;
       int[]  knightPos = {4, 5};
        int[] targetPos = {1, 1};
        System.out.println(minStepToReachTarget(knightPos,targetPos,N));
    }

}
