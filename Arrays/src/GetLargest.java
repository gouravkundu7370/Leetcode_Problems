public class GetLargest {
    public static void main(String[] args) {
        int[] arr ={5,8,20,15};
        System.out.println(getLargest(arr));
    }
    public static int getLargest(int[] arr){
        int res = 0;
        for(int i = 0;i<arr.length;i++){
            if (arr[i] > arr[res]){
                res = i;
            }
        }
        return res;
    }
}
