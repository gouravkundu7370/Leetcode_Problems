import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Kth_Smallest {
    //Function to find the kth smallest element in the array.
    public static int kthSmallest(int arr[], int n, int k)
    {
        // Your code here
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0 ;i <k ;i++){
            pq.add(arr[i]);
        }
        for(int i = k;i<n ;i++){
            if(pq.peek() < arr[i]){
                continue;
            }
            else{
                pq.poll();
                pq.add(arr[i]);
            }
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        int N = 5, K = 3;
        int arr[] = {3,5,4,2,9};
        System.out.println(kthSmallest(arr,N,K));
    }
}
