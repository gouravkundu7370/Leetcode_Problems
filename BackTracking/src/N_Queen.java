public class N_Queen {


    static void printSolution(int[][] board)
    {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++)
                System.out.print(" " + board[i][j]
                        + " ");
            System.out.println();
        }
    }

    static boolean isSafe(int row, int col,int N,int[][] board)
    {
        int i, j;

        // checking row
        for (i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;

        // checking upper diagonal
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;

        // checking lower diagonal
        for (i = row, j = col; j >= 0 && i < N; i++, j--)
            if (board[i][j] == 1)
                return false;

        return true;
    }

    static boolean solveRec(int col,int N,int[][] board)
    {
        if (col == N)
            return true;

        for (int i = 0; i < N; i++) {
            if (isSafe(i, col,N,board)) {
                board[i][col] = 1;

                if (solveRec(col + 1,N,board))
                    return true;

                board[i][col] = 0;
            }
        }
        return false;
    }

    static  boolean solve(int N,int[][] board)
    {

        if (!solveRec(0,N,board)) {
            System.out.print("Solution does not exist");
            System.exit(0);
        }

        printSolution(board);
        return true;
    }

    public static void main(String[] args)
    {
        int N= 4;
        int[][] board = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = 0;
            }

        }
        System.out.println(solve(N,board));
    }
}
