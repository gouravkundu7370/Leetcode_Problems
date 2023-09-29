public class LargestNumberKSwaps {
    static String max;
    public static String findMaximumNum(String str, int k){

        int i=0;
        int n = str.length();

        max = str;
        solve(str,k,i,n);
        return max;
    }
    public static void solve(String str, int k, int id, int n){
        if(str.compareTo(max)>0)
            max = str;
        if(k==0)
            return;
        for(int i=id; i<n - 1;i++){
            for(int j = i + 1; j <= n-1; j++){
                if(str.charAt(j)>str.charAt(i)){
                    String swapped= swap(str,i,j);
                    solve(swapped,k-1,i+1,n);
                }
            }
        }
    }
    public static String swap(String str,int i, int j)
    {
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(i, str.charAt(j));
        sb.setCharAt(j, str.charAt(i));
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(findMaximumNum("1234567",4));
    }
}
