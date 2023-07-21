import java.util.ArrayList;
import java.util.HashSet;

public class PositiveNegativePair {
    public static void main(String[] args) {
        int n = 8;
        int[] arr = {1,3,6,-2,-1,-3,2,7};
        ArrayList<Integer> ans = findPairs(arr,n);
        System.out.println(ans);

    }
    //Function to return list containing all the pairs having both
    //negative and positive values of a number in the array.
    public static ArrayList<Integer> findPairs(int[] arr, int n)
    {
        // code here.
        HashSet<Integer> h = new HashSet<>();
        ArrayList<Integer> res = new ArrayList<>();

        for(int i:arr){

            if(h.contains(-i)){

                int pos = Math.max(i,-i);

                int neg = Math.min(i,-i);

                res.add(neg);

                res.add(pos);

            }

            h.add(i);

        }

        return res;
    }
}
