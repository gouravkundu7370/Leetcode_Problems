import java.util.Arrays;

public class FindTriangles {
    public static void main(String[] args) {
       int n = 5 ;
        int[] arr = {6, 4, 9, 7, 8};
        System.out.println(findNumberOfTriangles(arr,n));

    }
    static int findNumberOfTriangles(int[] arr, int n)
    {
        // code here
        Arrays.sort(arr);
        int count=0;
        for(int i=n-1;i>=0;i--){

            int j=0;
            int k=i-1;

            while(j<k)
            {
                if(arr[j]+arr[k]>arr[i])
                {
                    count = count+(k-j);
                    k--;
                }
                else
                {
                    j++;
                }
            }
        }
        return count;
    }
}
