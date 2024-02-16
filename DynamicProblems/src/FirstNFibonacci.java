import java.util.Arrays;

public class FirstNFibonacci {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(printFibb(5)));
    }
    public static long[] printFibb(int n)
    {
        //Your code here
        if (n <= 0){
            return new long[0];

        }
        long[] fibb = new long[n];
        fibb[0] = 1;
        if( n > 1){
            fibb[1] = 1;
            for(int i = 2;i<n;i++){
                fibb[i] = fibb[i-1] + fibb[i-2];
            }
        }
        return fibb;
    }
}
