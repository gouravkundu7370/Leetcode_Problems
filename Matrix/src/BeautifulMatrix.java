public class BeautifulMatrix {
    public static void main(String[] args) {
        int N = 3;
        int[][] matrix = {{1, 2, 3},
            {4, 2, 3},
            {3, 2, 1}};
        System.out.println(findMinOperation(matrix,N));

    }
    //Function to find minimum number of operations that are required
    //to make the matrix beautiful.
    static int findMinOperation(int[][] arr, int n)
    {
        // code here
        int max =0;

        for(int i =0; i<n; i++){

            int rsum = 0;

            int csum =0;

            for(int j =0; j<n;j++){

                rsum += arr[i][j];

            }

            max = Math.max(rsum, max);

            for(int k =0; k<n; k++){

                csum +=arr[k][i];

            }

            max = Math.max(csum, max);

        }

        int c = 0 ;

        for(int i =0; i<n; i++){

            int sum =0;

            for(int j =0; j<n; j++){

                sum +=arr[i][j];

            }

            c += max - sum ;

        }

        return c;
    }
}
