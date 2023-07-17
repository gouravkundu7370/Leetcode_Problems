public class OperationsArrays {
    public static int insert(int[] arr, int n, int x, int cap, int pos)
    {
        if(n == cap)
            return n;

        int idx = pos - 1;

        for(int i = n - 1; i >= idx; i--)
        {
            arr[i + 1] = arr[i];
        }

        arr[idx] = x;

        return n + 1;
    }
    static int search(int[] arr, int n, int x)
    {
        for(int i = 0; i < n; i++)
        {
            if(arr[i] == x)
                return i;
        }

        return -1;
    }
    static int deleteEle(int[] arr, int n, int x)
    {
        int i = 0;

        for(i = 0; i < n; i++)
        {
            if(arr[i] == x)
                break;
        }

        if(i == n)
            return n;

        for(int j = i; j < n - 1; j++)
        {
            arr[j] = arr[j + 1];
        }

        return n-1;
    }

    public static void main(String[] args)
    {
        int[] arr = new int[5];
        int cap = 5;
        int n = 3;

        arr[0] = 5; arr[1] = 10; arr[2] = 20;

        System.out.println("Before Insertion");

        for(int i=0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        int x = 7, pos = 2;

        n = insert(arr, n, x, cap, pos);

        System.out.println("After Insertion");

        for(int i=0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int[] arr1 = {2,1,5,8};
        int target = 5;

        System.out.println(search(arr1,arr1.length,target));


        int[] arr2 = {3, 8, 12, 5, 6};
         x = 12;
         n = 5;


        System.out.println("Before Deletion");


        for(int i=0; i < n; i++)
        {
            System.out.print(arr2[i]+" ");
        }

        System.out.println();


         n = deleteEle(arr2, n, x);

        System.out.println("After Deletion");

        for(int i=0; i < n; i++)
        {
            System.out.print(arr2[i]+" ");
        }
    }
}
