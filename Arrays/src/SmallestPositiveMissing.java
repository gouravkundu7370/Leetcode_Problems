import java.util.Arrays;

public class SmallestPositiveMissing {
    public static void main(String[] args) {
        int[] arr = {0,-10,1,3,-20};
        System.out.println(missingNumber(arr,5));

    }
    static int segregate (int[] arr, int size)
    {
        int j = 0, i;
        for(i = 0; i < size; i++)
        {
            if (arr[i] <= 0)
            {
                int temp;
                //changing the position of negative numbers and 0.
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                //incrementing count of non-positive integers.
                j++;
            }
        }
        return j;
    }

    //Finding the smallest positive missing number in an array
    //that contains only positive integers.
    static int missingNumber(int[] arr, int size)
    {
        // Your code here
        Arrays.sort(arr);
        int min = 1;
        for(int i = 0;i<size;i++){
            if(arr[i] == min){
                min++;
            }

        }
        return min;
    }
}
