public class LuckyNumbers {
    public static void main(String[] args) {
        System.out.println(isLucky(3));
    }
    public static boolean isLucky(int n)
    {
        // Your code here
        if(n%2 == 0){
            return false;
        }
        return check(n-n/2,3);
    }
    public static boolean check(int n, int count){
        if(n<count) return true;
        else{
            if(n%count==0) return false;
            else{
                n = n - n/count;
                return check(n, count+1);
            }
        }
    }
}
