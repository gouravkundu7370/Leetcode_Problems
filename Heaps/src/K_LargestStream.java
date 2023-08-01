import java.util.PriorityQueue;

public class K_LargestStream {
    public static void kthLargest(int[] arr, int n, int k){
        // Your code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<n;i++){
            if(pq.size()<k){
                pq.offer(arr[i]);
            }
            else{
                if(pq.peek()<arr[i]){
                    pq.poll();
                    pq.offer(arr[i]);
                }
            }
            if(pq.size()<k){
                System.out.print(-1+" ");
            }
            else System.out.print(pq.peek()+" ");
        }
    }

    public static void main(String[] args) {
        int k = 4, n = 6;
        int arr[] = {1,2,3,4,5,6};
        kthLargest(arr,n,k);
    }
}
