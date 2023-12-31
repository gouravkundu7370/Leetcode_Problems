public class CheckArrSorted {
    static boolean isSorted(int[] arr, int n)
    {
        for(int i = 1; i < n; i++)
        {
            if(arr[i] < arr[i - 1])
                return false;
        }

        return true;
    }

    public static void main(String[] args)
    {
        int[] arr = {5, 12, 30, 2, 35};
        int n = 5;

        System.out.println(isSorted(arr, n));
    }
}
