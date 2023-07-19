import java.util.Arrays;

public class MinimumPlatforms {
    public static void main(String[] args) {
        int n = 6;
        int[] arr = {900, 940, 950, 1100, 1500, 1800};
        int[] dep = {910, 1200, 1120, 1130, 1900, 2000};
        System.out.println(findPlatform(arr,dep,n));
    }
    static int findPlatform(int[] arr, int[] dep, int n)
    {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);

        int i=0,j=0,res=0,curr=0;
        while(i<n){
            if(arr[i] <=dep[j]){
                curr++;
                res = Math.max(res,curr);
                i++;
            }else{
                curr--;
                j++;
            }
        }
        return res;

    }
}
