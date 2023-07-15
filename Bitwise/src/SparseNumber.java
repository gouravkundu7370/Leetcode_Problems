public class SparseNumber {
    /*
    Given a number N. The task is to check whether it is sparse or not. A number is said to be a sparse number if
    no two or more consecutive bits are set in the binary representation.
     */
    public static boolean isSparse(int n)
    {
        // Your code here
        while(n != 0){
            int dig1 = n & 1;
            n = n >> 1;
            int dig2 = n & 1;
            if((dig1 == 1) && (dig2 == 1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isSparse(4));
    }
}
