import java.util.*;

public class SortArraywrtOtherArr {
    public static void main(String[] args) {
        int N = 11;
        int M = 4;
        int[] A1 = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8};
        int[] A2 = {2, 1, 8, 3};
        int[] res = sortA1ByA2(A1,N,A2,M);
        System.out.println(Arrays.toString(res));
    }
    // A1[] : the input array-1
    // N : size of the array A1[]
    // A2[] : the input array-2
    // M : size of the array A2[]

    //Function to sort an array according to the other array.
    public static int[] sortA1ByA2(int[] A1, int N, int[] A2, int M)
    {
        Arrays.sort(A1);// sort the array

        Set<Integer> set = new HashSet<>();
        for(int num : A2)
            set.add(num); //add elements of A2 in set

        int[] res = new int[N];
        Map<Integer, Integer> map = new HashMap<>();
        int ind = N-1;
        // now check from last index of set if it's not present in set(A2) then
        // add it to the index decreasing from last of resultant array
        // if its present in the set then add it to map and increase its frequency
        for(int i = N-1 ; i >= 0 ; i--){
            int num = A1[i];
            if(!set.contains(num)){
                res[ind] = num;
                ind--;
            }
            else{
                map.put(num, map.getOrDefault(num, 0)+1);
            }
        }

        //now iterate over A2 and decrement the frequency of element in map till zero
        //and add the element till frequency decreases in resultant array
        int i = 0;
        for(int num : A2){
            if(map.containsKey(num)){
                while(map.get(num) > 0){
                    res[i] = num;
                    map.put(num, map.get(num)-1);
                    i++;
                }
            }
        }

        return res;
    }
}
