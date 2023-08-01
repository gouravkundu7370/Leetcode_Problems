import java.util.*;

public class KMostOccElementHash {
    //Function to print the sum of frequencies of k numbers
    //with most occurrences in an array.
    static int kMostFrequent(int[] arr, int n, int k){
        // your code here
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int i = 0 ;i < n ; i++){
            if(freq.containsKey(arr[i])){
                freq.put(arr[i],freq.get(arr[i])+1);
            }
            else{
                freq.put(arr[i],1);
            }
        }
        Collection<Integer> values = freq.values();
        ArrayList<Integer> listOfValues = new ArrayList<>(values);
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.addAll(listOfValues);
        int sum = 0;
        for(int i = 0 ; i < k ;i++){
            int p = pq.poll();
            sum +=p;
        }
        return sum;
    }

    public static void main(String[] args) {
       int N = 8;
        int[] arr = {3,1,4,4,5,2,6,1};
        System.out.println(kMostFrequent(arr,N,2));
    }
}
