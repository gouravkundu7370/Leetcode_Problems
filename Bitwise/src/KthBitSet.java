public class KthBitSet {
    public static void isKthBitSet_RightShift(int n,int k)
    {
        if (((n >> (k - 1)) &
                1) == 1)
            System.out.println("SET");
        else
            System.out.println("NOT SET");
    }


    // Driver code
    public static void main (String[] args)
    {
        int n = 5, k = 1;
        isKthBitSet_RightShift(n, k);
    }

}
