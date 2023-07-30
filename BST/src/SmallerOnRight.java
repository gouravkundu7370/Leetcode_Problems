import java.util.Scanner;
import java.util.TreeSet;

public class SmallerOnRight {
    public static void main (String[] args)
    {
        //code
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int []arr;

        while(t-- > 0){
            int n = sc.nextInt();
            arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            System.out.println(sOR(arr, n));
        }
    }

    private static int sOR(int arr[], int n){
        TreeSet<Integer> set = new TreeSet<>();
        int count=0;
        for(int i=n-1; i>=0; i--){
            set.add(arr[i]);
            count = Math.max(set.headSet(arr[i]).size(), count);
        }
        return count;
    }

}
