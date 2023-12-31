public class BinarySearch {
    static int bSearchiterative(int[] arr, int n, int x)
    {
        int low = 0, high = n - 1;

        while(low <= high)
        {
            int mid = (low + high) / 2;

            if(arr[mid] == x)
                return mid;

            else if(arr[mid] > x)
                high = mid - 1;

            else
                low = mid + 1;
        }

        return -1;
    }

    public static void main(String[] args)
    {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int n = 6;

        int x = 40;

        System.out.println(bSearchiterative(arr, n, x));
        System.out.println(bSearch(arr, 0, n - 1, x));

    }
    static int bSearch(int[] arr, int low, int high, int x)
    {
        if(low > high)
            return -1;

        int mid = (low + high) / 2;

        if(arr[mid] == x)
            return mid;

        else if(arr[mid] > x)
            return bSearch(arr, low, mid - 1, x);

        else
            return bSearch(arr, mid + 1, high, x);
    }
}
