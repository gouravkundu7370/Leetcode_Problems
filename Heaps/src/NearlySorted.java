import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class NearlySorted {
    public static ArrayList<Integer> nearlySorted(int[] arr, int n, int k)
    {
        // your code here
        Queue<Integer> minHeap = new PriorityQueue<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i<= k;i++){
            minHeap.add(arr[i]);
        }
        for(int i = k+1 ;i<n;i++){
            ans.add(minHeap.poll());
            minHeap.add(arr[i]);
        }
        while(!minHeap.isEmpty()){
            ans.add(minHeap.poll());
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {6,5,3,2,8,10,9};
       int n = 7, k = 3;
        System.out.println(nearlySorted(arr,n,k));
    }
}
