public class NthFibonacciNumber {
    public static void main(String[] args) {
        System.out.println(findNthFibonacci(5));
    }
    public static long findNthFibonacci(int number)
    {
        if(number==1||number==2) return 1;
        long[] dp=new long[number];
        return fun(number, dp);
    }
    private static long fun(int number, long[] dp){
        dp[0]=1;
        dp[1]=1;
        for(int i=2; i<number; i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[number-1];
    }
}
