public class BlackANDWhiteKnights {
    static int[][] dir = {{-2,-1},{-1,2},{1,-2},{-1,-2},{2,1},{1,2},{-2,1},{2,-1}};

    static boolean isSafe(int i,int j,boolean[][] chess){


        boolean ans = false;
        for(int ii=0; ii<dir.length; ii++ ){


            int ci = i+dir[ii][0];
            int cj = j+dir[ii][1];

            if(ci >= chess.length || cj >= chess[0].length || ci < 0 || cj < 0)  continue;
            ans = ans || chess[ci][cj];
            if(ans)
                break;

        }

        return !ans;

    }
    static int NotSafeCount(int i,int j,boolean[][] chess){

        int ansC = 0;
        for(int ii=0; ii<dir.length; ii++ ){


            int ci = i+dir[ii][0];
            int cj = j+dir[ii][1];

            if(ci >= chess.length || cj >= chess[0].length || ci < 0 || cj < 0)  continue;
            ansC++;

        }


        return ansC;

    }
    static long ans = 0;
    // Recursive Approach TLE
    static void solve(int idx,boolean[][] chess, int kPlaced,int M,int N ){

        if(kPlaced == 2){
            ans++;
            return;
        }

        for(int i=0; i<N; i++){
            for(int j = 0; j<M; j++){
                if(!chess[i][j])
                    if(isSafe(i,j,chess)){
                        chess[i][j] = true;
                        solve(i+1,chess,kPlaced+1,M,N);
                        chess[i][j] = false;
                    }

            }
        }
    }
    // Simple Maths
    static int  countWays( boolean[][] chess){
        int ansF = 0;

        for(int i = 0; i<chess.length; i++){
            for(int j=0; j<chess[0].length; j++){

                int x = NotSafeCount(i,j,chess);
                ansF = ansF+(((chess.length*chess[0].length)-1-x));
                ansF %= ((int)(1e9+7));
            }
        }
        return ansF;
    }


    static long numOfWays(int N, int M)
    {
        ans = 0;
        //solve(0,new boolean[N][M],0,M,N);
        return (countWays(new boolean[N][M])%((int)(1e9+7)));

    }

    public static void main(String[] args) {
        System.out.println(numOfWays(2,3));
    }
}

