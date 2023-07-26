import java.util.Arrays;
import java.util.Stack;

public class MaximumofMinimumWindow {
    //Function to find maximum of minimums of every window size.
    static int[] maxOfMin(int[] arr, int n)
    {
        // Your code here
        // Your code here
        int[] leftmin=new int[n];
        int[] rightmin=new int[n];
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        //next left min
        for(int i=0;i<n;i++){
            while(!s1.isEmpty() && arr[s1.peek()]>=arr[i]){
                s1.pop();
            }
            leftmin[i]=s1.isEmpty()?-1:s1.peek();
            s1.push(i);
        }
        //next right min
        for(int i=n-1;i>=0;i--){
            while(!s2.isEmpty() && arr[s2.peek()]>=arr[i]){
                s2.pop();
            }
            rightmin[i]=s2.isEmpty()?n:s2.peek();
            s2.push(i);
        }
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            int subArrayLen=rightmin[i]-leftmin[i]-1;
            res[subArrayLen-1]=Math.max(arr[i],res[subArrayLen-1]);
        }


        for(int i=n-2;i>=0;i--){
            if(res[i]<res[i+1]){
                res[i]=res[i+1];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int N = 7;
        int[] arr = {10,20,30,50,10,70,30};
        System.out.println(Arrays.toString(maxOfMin(arr,N)));
    }
}
