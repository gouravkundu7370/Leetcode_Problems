import java.util.Arrays;

public class BinSort {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,0};
        binSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void binSort(int[] A, int N)
    {
        // add your code here
        int left = 0;
        int right = N-1;
        while(left<right){
            if(A[left] == 1){
                if(A[right] == 0) swap(A,left,right);
                else right--;
            }else left++;
        }
    }
    static void swap(int[]A,int left,int right){
        int temp = A[left];
        A[left] = A[right];
        A[right] = temp;
    }
}
