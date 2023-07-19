import java.util.Arrays;

public class ThreeWayPartition {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 3, 4};
        threeWayPartition(A,1,2);
        System.out.println(Arrays.toString(A));

    }
    public static void threeWayPartition(int[] arr, int a, int b)
    {
        // code here
        int l = 0;
        int mid = 0;
        int h = arr.length - 1;
        while(mid <= h){
            if(arr[mid]<a){
                swap(arr,l,mid);
                l++;
                mid++;

            }
            else if(arr[mid]>b){
                swap(arr,h,mid);
                h--;
            }
            else {
                mid++;
            }

        }
    }
    public static void swap(int[]A,int left,int right){
        int temp = A[left];
        A[left] = A[right];
        A[right] = temp;
    }
}
