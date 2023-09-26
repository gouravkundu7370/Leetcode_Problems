import java.util.ArrayList;
import java.util.Arrays;

public class JobScheduling1 {
    static class Job {
        int id, profit, deadline;
        Job(int x, int y, int z){
            this.id = x;
            this.deadline = y;
            this.profit = z;
        }
    }
    public static void main(String[] args) {
        ArrayList<Job> arr = new ArrayList<Job>();
        arr.add(new Job('a', 2, 100));
        arr.add(new Job('b', 1, 20));
        arr.add(new Job('c', 2, 40));
        arr.add(new Job('d', 1, 80));
        arr.add(new Job('e', 3, 60));
        Job[] array = new Job[arr.size()];
        array = arr.toArray(array);
        System.out.println(Arrays.toString(JobScheduling(array, 3)));
    }
    public static  int[] JobScheduling(Job[] arr, int n)
    {
        // Your code here
        Arrays.sort(arr, (a, b) -> b.profit - a.profit);
        int max = 0;
        for(int i=0; i<n; i++) {
            max = Math.max(max, arr[i].deadline);
        }

        boolean[] vis = new boolean[max+1];
        int size = 0;
        int sum = 0;

        for(int i=0; i<n; i++) {
            for(int j=arr[i].deadline; j>0; j--) {
                if(!vis[j]) {
                    vis[j] = true;
                    size++;
                    sum += arr[i].profit;
                    break;
                }
            }
        }

        int[] ans =  {size, sum};
        return ans;
    }
}
