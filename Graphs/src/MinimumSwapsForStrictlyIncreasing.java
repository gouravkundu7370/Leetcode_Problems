import java.util.Arrays;
import java.util.HashMap;

public class MinimumSwapsForStrictlyIncreasing {
    public static void main(String[] args) {
        int[] nums = {2, 8, 5, 4};
        System.out.println(minSwaps(nums));
    }
    //Function to find the minimum number of swaps required to sort the array.
    public static int minSwaps(int[] a)
    {
        // Code here
        int count=0;
        int n=a.length;
        int[] b = Arrays.copyOf(a,n);
        Arrays.sort(b);
        HashMap<Integer, Integer> hm=new HashMap<>();
        for(int i=0; i<n; i++){
            hm.put(b[i], i);
        }
        for(int i=0; i<n; i++){
            while(hm.get(a[i])!=i){
                count++;
                swap(a, hm.get(a[i]), i);
            }
        }
        return count;
    }
    static void swap(int []arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
