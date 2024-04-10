public class KadaneAlgoMaximumSum {
    public static void main(String[] args) {
        int[] arr = {5,-2,-3,32,-5,65};
        System.out.println(maximumSum(arr,arr.length));
    }
    public static long maximumSum(int[] arr, int sizeOfArray)
    {
        //code here
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < sizeOfArray; i++) {
            currSum = Math.max(currSum+arr[i],arr[i]);
            maxSum = Math.max(currSum,maxSum);
            System.out.print(currSum + " ");

        }
        System.out.println();
        return  maxSum;
    }
}
