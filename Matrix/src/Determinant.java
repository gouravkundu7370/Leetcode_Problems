public class Determinant {
    public static void main(String[] args) {
        int N = 4;
        int[][] matrix = {{1, 0, 2, -1},
            {3, 0, 0, 5},
            {2, 1, 4, -3},
            {1, 0, 5, 0}};
        System.out.println(determinantOfMatrix(matrix,N));

    }
    //Function for finding determinant of matrix.
    static int determinantOfMatrix(int[][] matrix, int n)
    {
        // code here
        if(n==1) {
            return matrix[0][0];
        }

        int res=0;

        for(int i=0; i<n; i++) {

            int[][] mat = sMat(matrix, n, i);

            if(i%2 == 0) {
                res += matrix[0][i]*determinantOfMatrix(mat, n-1);
            }

            else {
                res += -1*matrix[0][i]*determinantOfMatrix(mat, n-1);
            }
        }

        return res;
    }

    static int[][] sMat(int[][] matrix, int n, int i) {

        int[][] mat = new int[n-1][n-1];

        for(int j=1; j<n; j++){
            int c=0;
            for(int k=0; k<n; k++) {

                if(k!=i) {
                    mat[j-1][c] = matrix[j][k];
                    c++;
                }
            }
        }

        return mat;

    }
}
