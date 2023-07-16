public class RecPower {
    public static void main(String[] args) {
        System.out.println(RecursivePower(3,5));
    }
    public static int RecursivePower(int n,int p)
    {
        // add your code here
        if (p == 0){
            return 1;
        }
        return RecursivePower(n,p-1)*n;
    }
}
