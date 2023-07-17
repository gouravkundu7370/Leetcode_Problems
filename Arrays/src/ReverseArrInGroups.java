import java.util.ArrayList;

public class ReverseArrInGroups {
    public static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
        for (int i = 0; i < n; i += k)
        {
            int left = i;

            // to handle case when k is not multiple
            // of n
            int right = Math.min(i + k - 1, n - 1);
            int temp;

            // reverse the sub-array [left, right]
            while (left < right)
            {
                temp=arr.get(left);
                arr.set(left,arr.get(right));
                arr.set(right,temp);
                left+=1;
                right-=1;
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(5);
        arr.add(7);
        arr.add(30);
        int n = 4;

        System.out.println("Before Reverse");

        System.out.println(arr);

        System.out.println();

        reverseInGroups(arr,n,2);
        System.out.println("After Reverse");
        System.out.println(arr);


    }
}
