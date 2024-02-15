import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CombinationSumBT {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(7);
        arrayList.add(2);
        arrayList.add(6);
        arrayList.add(5);

        System.out.println(combinationSum(arrayList,16));


    }
    static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B)
    {
        // add your code here
        //as the given list contains some duplicate elements. so,first we have to remove that duplicate elements by making a set
        Set<Integer> set = new HashSet<>(A);
        //deleting all the elements from the list
        A.clear();
        //adding all unique elements in the list using set
        A.addAll(set);
        Collections.sort(A);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> inner = new ArrayList<>();
        combinations(res,inner,A,0,B);
        return res;
    }
    static void combinations(ArrayList<ArrayList<Integer>> res,ArrayList<Integer> inner,ArrayList<Integer> arr,int idx,int B){

        if(idx==arr.size()){
            if(B==0){
                res.add(new ArrayList<>(inner));
            }
            return;
        }

        if(arr.get(idx)<=B){
            inner.add(arr.get(idx));
            combinations(res,inner,arr,idx,B-arr.get(idx));
            inner.remove(inner.size()-1);
        }
        combinations(res,inner,arr,idx+1,B);
    }
}
