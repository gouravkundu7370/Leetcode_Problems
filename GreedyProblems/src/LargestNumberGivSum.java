public class LargestNumberGivSum {
    static String largestNumber(int n, int sum)
    {
        // add your code here
        if(n==0){
            return "-1";
        }
        StringBuilder num=new StringBuilder();
        for(int i=0;i<n;i++){
            for(int dig=9;dig>=0;dig--){
                if(sum>=dig){
                    num.append(dig);
                    sum -=dig;
                    break;
                }
            }
        }
        return sum==0?num.toString():"-1";
    }
    public static void main(String[] args) {
        System.out.println(largestNumber(5,12));

    }
}
