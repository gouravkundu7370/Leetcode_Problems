public class RightMostDiffBit {
    public static void main(String[] args) {
        System.out.println(posOfRightMostDiffBit(9,11));
    }
    public static int posOfRightMostDiffBit(int m, int n)
    {

        // Your code here
        if(n == m){
            return -1;
        }
        int index = 1;
        while((m & 1) == (n & 1)){
            n = n >> 1;
            m = m >> 1;
            index++;
        }
        return index;
    }
}
