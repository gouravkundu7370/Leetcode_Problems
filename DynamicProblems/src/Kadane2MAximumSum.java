public class Kadane2MAximumSum {
    public static void main(String[] args) {
int[] arr = {4,5,6,7,8};
        System.out.println(maximumSum(arr,arr.length));
    }
    public static long maximumSum(int[] arr, int n)
    {
        //Your code here
        if(n == 1) return arr[0];
        if(n == 2) return Math.max(arr[0], arr[1]);

        int[] dp = new int[n];
        dp[0] = arr[0];
        dp[1] = Math.max(dp[0], arr[1]);

        for(int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], Math.max(dp[i - 2] + arr[i], arr[i]));
        }

        return dp[n - 1];
    }
}
