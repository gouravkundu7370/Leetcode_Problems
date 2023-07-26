import java.util.Stack;

public class DeleteMidStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(2);
        s.push(5);
        s.push(3);
        s.push(4);
        deleteMid(s,s.size());
        System.out.println(s.size());

    }
    public static void deleteMid(Stack<Integer> s, int sizeOfStack){
        // code here
        int mid = (sizeOfStack-1)/2;
        int a = sizeOfStack -mid - 1;
        int[] arr = new int[a];
        int i = 0;
        while(a!= 0){
            arr[i] = s.pop();
            i++;
            a--;
        }
        s.pop();
        for(int j = arr.length-1;j>=0;j--){
            s.push(arr[j]);
        }

    }
}
