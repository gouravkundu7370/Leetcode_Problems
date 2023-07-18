public class MinimumNumber {
    static int minNumber(int[] arr, int low, int high)
    {
        // Your code here
        int min = arr[0];
        while (low <= high){
            int mid = (low+high)/2;
            if(arr[mid] >= min){
                low = mid+1;
            }
            else{
                min = arr[mid];
                high = mid;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,9,10,1};
        System.out.println(minNumber(arr,0,arr.length-1));
    }
}
