public class LeftRotate {
    static void leftRotate(int[] arr, int d, int n)
    {
        reverse(arr, 0, d - 1);

        reverse(arr, d, n - 1);

        reverse(arr, 0, n - 1);

    }

    static void reverse(int[] arr, int low, int high)
    {
        while(low < high)
        {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5};
        int n = 5;
        int d = 2;

        System.out.println("Before Rotation");

        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        leftRotate(arr, d, n);

        System.out.println("After Rotation");

        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
