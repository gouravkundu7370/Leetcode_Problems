import java.util.ArrayList;
import java.util.LinkedHashSet;

public class UniqueSubsets {
    public static ArrayList <ArrayList <Integer>> AllSubsets(int[] arr, int n){



        LinkedHashSet <ArrayList <Integer>> res = new LinkedHashSet<>();

        ArrayList<Integer> set = new ArrayList<>();

        res.add(set);

        store(res,set,arr,0);

        return new ArrayList<>(res);

    }

    static void store(LinkedHashSet<ArrayList <Integer>> res, ArrayList<Integer> set, int[] arr, int index){

        if(index == arr.length) {
            return ;
        }


        set.add(arr[index]);

        res.add(new ArrayList<>(set));

        store(res,set,arr,index+1);

        set.remove(set.size()-1);

        store(res,set,arr,index+1);

    }

    public static void main(String[] args) {
        int N = 4;
        int[] arr = {1,2,3,3};
        System.out.println(AllSubsets(arr,N));

    }
}
