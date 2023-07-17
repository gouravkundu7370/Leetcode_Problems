public class MaximumSubArrSum {
    public static int maxSum(int[] arr, int n) {
        int maxEnding = arr[0];
        int res = arr[0];

        for (int i = 0; i < n; i++) {
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            res = Math.max(res, maxEnding);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {-3, 8, -2, 4, -5, 6};
        int n = 6;

        int res = maxSum(arr, n);
        System.out.println(res);
    }
}
