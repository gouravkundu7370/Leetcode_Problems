import java.util.Arrays;

public class MultiplyMatrix {
    public static void main(String[] args) {
        int n1 = 3, m1 = 2;
        int A[][] = {{4, 8},
            {0, 2},
            {1, 6}};
        int n2 = 2, m2 = 2;
        int B[][] = {{5, 2},
            {9, 4}};
        int[][] arr = multiplyMatrix(A,B);
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }
    static int[][] multiplyMatrix(int[][] A, int[][] B)
    {
        // code here
        int n1=A.length;
        int n2=B.length;
        int m1=A[0].length;
        int m2=B[0].length;
        if(m1!=n2){
            return new int[0][0];
        }
        int [][]r=new int[n1][m2];
        for(int i=0;i<n1;i++){
            for(int j=0;j<m2;j++){
                for(int k=0;k<m1;k++){
                    r[i][j]+=A[i][k]*B[k][j];
                }
            }
        }
        return r;
    }
}
